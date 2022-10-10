package irvine.oeis.a059;

import irvine.math.z.Z;
import irvine.oeis.a000.A000330;

/**
 * A059774 Consider the line segment in R^n from the origin to the point P=(1,2,3,...,n); let d = squared distance to this line from the closest point of Z^n (excluding the endpoints). Sequence gives d times P.P.
 * @author Sean A. Irvine
 */
public class A059774 extends A000330 {

  // WARNING: Conjectural, do not use to extend the sequence

  private static final long[] SMALL = {1, 3, 9, 21, 40, 75, 120, 189};
  private int mN = 0;
  {
    super.next();
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
