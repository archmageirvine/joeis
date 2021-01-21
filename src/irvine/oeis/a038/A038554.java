package irvine.oeis.a038;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A038554 Derivative of n: write n in binary, replace each pair of adjacent bits with their mod 2 sum (a(0)=a(1)=0 by convention). Also n XOR (n shift 1).
 * @author Sean A. Irvine
 */
public class A038554 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return ++mN < 2 ? Z.ZERO : Z.valueOf((mN ^ (mN >>> 1)) - (1L << LongUtils.lg(mN)));
  }
}
