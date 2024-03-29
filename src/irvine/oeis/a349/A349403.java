package irvine.oeis.a349;
// Generated by gen_seq4.pl knest at 2023-03-02 20:46

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a007.A007489;

/**
 * A349403 Sum of the digits of Sum_{k=1..n} k!.
 * @author Georg Fischer
 */
public class A349403 extends A007489 {
  @Override
  public Z next() {
    return Z.valueOf(ZUtils.digitSum(super.next()));
  }
}
