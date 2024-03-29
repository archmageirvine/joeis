package irvine.oeis.a178;
// Generated by gen_seq4.pl num1dis at 2021-04-28 10:09

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a001.A001358;


/**
 * A178065 Number of 1's in binary representation of n-th semiprime.
 * @author Georg Fischer
 */
public class A178065 extends A001358 {

  @Override
  public Z next() {
    return Z.valueOf(ZUtils.digitCounts(super.next(), 2)[1]);
  }
}
