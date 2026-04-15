package irvine.oeis.a157;

import irvine.math.z.Z;

/**
 * A157276 A157107=220,440,661,881,1105, - 220,440,660,880,1100,=220*(n+1)=10*A008604(n+1).
 * @author Sean A. Irvine
 */
public class A157276 extends A157107 {

  private long mN = 0;

  @Override
  public Z next() {
    mN += 220;
    return super.next().subtract(mN);
  }
}
