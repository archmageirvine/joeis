package irvine.oeis.a064;

import irvine.math.function.Functions;
import irvine.oeis.FilterSequence;
import irvine.oeis.a002.A002808;

/**
 * A064499 Composite numbers whose product of aliquot divisors is a perfect square.
 * @author Sean A. Irvine
 */
public class A064499 extends FilterSequence {

  /** Construct the sequence. */
  public A064499() {
    super(new A002808(), k -> k.root(4).auxiliary() == 1 || (Functions.SIGMA0.l(k) & 3) == 2);
  }
}
