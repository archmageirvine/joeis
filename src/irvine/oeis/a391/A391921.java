package irvine.oeis.a391;

import irvine.math.function.Functions;
import irvine.oeis.FilterSequence;
import irvine.oeis.a372.A372404;

/**
 * A391921 Powerful numbers that are not cubefree and are divisible by exactly 2 distinct primes.
 * @author Sean A. Irvine
 */
public class A391921 extends FilterSequence {

  /** Construct the sequence. */
  public A391921() {
    super(new A372404(), k -> Functions.OMEGA.i(k) == 2);
  }
}
