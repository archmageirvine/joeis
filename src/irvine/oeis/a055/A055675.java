package irvine.oeis.a055;

import irvine.math.z.Z;

/**
 * A055675 b(n) = least nonnegative integer h such that (n,h) is not collinear with any 2 points in the set S(n-1)union{(n,a(n))}, set S(n-1) and sequence a(n) as in A055674.
 * @author Sean A. Irvine
 */
public class A055675 extends A055674 {

  @Override
  public Z next() {
    super.next();
    return Z.valueOf(mB.get(mB.size() - 1));
  }
}
