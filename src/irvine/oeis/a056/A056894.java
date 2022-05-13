package irvine.oeis.a056;

import irvine.math.z.Z;

/**
 * A056894 If the smallest prime with a square excess of n is p then a(n)=p-n.
 * @author Sean A. Irvine
 */
public class A056894 extends A056893 {

  @Override
  public Z next() {
    return super.next().subtract(mN);
  }
}
