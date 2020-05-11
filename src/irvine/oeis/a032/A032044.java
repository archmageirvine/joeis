package irvine.oeis.a032;

import irvine.math.z.Z;

/**
 * A032044 "BFK" <code>(reversible</code>, size, unlabeled) transform of 2,1,1,1...
 * @author Sean A. Irvine
 */
public class A032044 extends A032006 {

  @Override
  public Z next() {
    return super.next().add(mN == 1 ? 2 : 1).divide2();
  }
}
