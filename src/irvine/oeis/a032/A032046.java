package irvine.oeis.a032;

import irvine.math.z.Z;

/**
 * A032046 "BFK" (reversible, size, unlabeled) transform of 1,3,5,7...
 * @author Sean A. Irvine
 */
public class A032046 extends A032008 {

  @Override
  public Z next() {
    return super.next().add(Math.max(1, 2 * mN - 1)).divide2();
  }
}
