package irvine.oeis.a068;

import irvine.math.z.ZUtils;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000040;

/**
 * A068807 Primes whose sum of digits is a power of 2.
 * @author Sean A. Irvine
 */
public class A068807 extends FilterSequence {

  /** Construct the sequence. */
  public A068807() {
    super(1, new A000040(), p -> Long.bitCount(ZUtils.digitSum(p)) == 1);
  }
}
