package irvine.oeis.a006;

import irvine.math.z.Z;

/**
 * A006386 Number of sensed genus 1 maps with n edges.
 * @author Sean A. Irvine
 */
public class A006386 extends A006387 {

  {
    setOffset(2);
  }

  private int mN = 1;

  @Override
  public Z next() {
    count(1, ++mN, 1, mN + 1, false);
    return Z.valueOf(mSums[1]);
  }
}
