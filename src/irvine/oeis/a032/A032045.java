package irvine.oeis.a032;

import irvine.math.z.Z;

/**
 * A032045 "BFK" <code>(reversible</code>, size, unlabeled) transform of 1,2,3,4...
 * @author Sean A. Irvine
 */
public class A032045 extends A032007 {

  @Override
  public Z next() {
    return super.next().add(Math.max(1, mN)).divide2();
  }
}
