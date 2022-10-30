package irvine.oeis.a059;

import irvine.math.z.Z;
import irvine.oeis.a024.A024450;

/**
 * A059804 Consider the line segment in R^n from the origin to the point v=(2,3,5,7,11,...) with prime coordinates; let d = squared distance to this line from the closest point of Z^n (excluding the endpoints). Sequence gives d times v.v.
 * @author Sean A. Irvine
 */
public class A059804 extends A024450 {

  // WARNING: Conjectural, do not use to extend the sequence

  private static final long[] SMALL = {1, 3, 9, 39, 87, 215, 391, 711, 1326, 1975, 2925, 4256, 5696, 7537, 9774, 12488, 16322};
  private int mN = 0;
  {
    setOffset(2);
  }

  @Override
  public Z next() {
    final Z t = super.next();
    if (mN < SMALL.length) {
      return Z.valueOf(SMALL[mN++]);
    }
    return t;
  }
}
