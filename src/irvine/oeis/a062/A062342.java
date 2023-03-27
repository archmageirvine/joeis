package irvine.oeis.a062;

import irvine.math.z.ZUtils;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000040;

/**
 * A062342 Primes whose sum of digits is a multiple of 8.
 * @author Sean A. Irvine
 */
public class A062342 extends FilterSequence {

  /** Construct the sequence. */
  public A062342() {
    super(new A000040(), k -> (ZUtils.digitSum(k) & 7) == 0);
  }
}
