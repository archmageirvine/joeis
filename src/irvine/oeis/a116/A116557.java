package irvine.oeis.a116;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.FiniteSequence;

/**
 * A116557 Backward iterated ( limited ) Fibonacci approximation: A000045.
 * @author Sean A. Irvine
 */
public class A116557 extends FiniteSequence {

  private static final CR C = CR.FIVE.sqrt().subtract(1).divide(2);

  private static List<Z> build() {
    final List<Z> res = new ArrayList<>();
    Z a = Z.valueOf(500000);
    res.add(a);
    do {
      a = C.multiply(a).floor();
      res.add(a);
    } while (!a.isOne());
    Collections.reverse(res);
    return res;
  }

  /** Construct the sequence. */
  public A116557() {
    super(0, FINITE, build());
  }
}
