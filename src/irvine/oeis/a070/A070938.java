package irvine.oeis.a070;

import irvine.math.function.Functions;
import irvine.oeis.FilterSequence;
import irvine.oeis.a005.A005349;

/**
 * A070566.
 * @author Sean A. Irvine
 */
public class A070938 extends FilterSequence {

  /** Construct the sequence. */
  public A070938() {
    super(1, new A005349(), k -> {
      final long ds = Functions.DIGIT_SUM.l(k);
      long m = 10;
      while (ds >= m) {
        m *= 10;
      }
      return k.mod(m) == ds;
    });
  }
}

