package irvine.oeis.a084;

import irvine.math.function.Functions;
import irvine.oeis.FilterSequence;
import irvine.oeis.a002.A002808;

/**
 * A084679 Composite numbers with coprime numbers of prime factors with and without repetition.
 * @author Sean A. Irvine
 */
public class A084679 extends FilterSequence {

  /** Construct the sequence. */
  public A084679() {
    super(1, new A002808(), k -> Functions.OMEGA.i(k) > 1 && Functions.GCD.l(Functions.BIG_OMEGA.l(k), Functions.OMEGA.l(k)) == 1);
  }
}
