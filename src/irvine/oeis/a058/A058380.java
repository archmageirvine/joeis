package irvine.oeis.a058;

import irvine.math.z.Z;

/**
 * A058380 Essentially series series-parallel networks with n labeled edges, multiple edges not allowed.
 * @author Sean A. Irvine
 */
public class A058380 extends A058379 {

  @Override
  public Z next() {
    final Z t = mF;
    final Z r = super.next();
    return mN == 0 ? r : r.signedAdd((mN & 1) == 0, t);
  }
}

