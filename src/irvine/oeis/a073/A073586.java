package irvine.oeis.a073;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a002.A002808;

/**
 * A073586 Composite numbers k such that (k+1)*sigma(k) is a perfect square.
 * @author Sean A. Irvine
 */
public class A073586 extends FilterSequence {

  /** Construct the sequence. */
  public A073586() {
    super(1, new A002808(), k -> Predicates.SQUARE.is(Functions.SIGMA1.z(k).multiply(k.add(1))));
  }
}
