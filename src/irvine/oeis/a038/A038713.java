package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A038713 a(n) = n XOR (n-1), i.e., nim-sum of sequential pairs, written in binary.
 * @author Sean A. Irvine
 */
public class A038713 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return new Z(Long.toBinaryString(mN ^ ++mN));
  }
}
