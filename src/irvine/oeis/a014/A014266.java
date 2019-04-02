package irvine.oeis.a014;

import irvine.math.z.Z;

/**
 * A014266 Number of trees on n nodes with forbidden limbs.
 * @author Sean A. Irvine
 */
public class A014266 extends A014265 {

  @Override
  public Z next() {
    final Z t = super.next();
    return mN == 8 ? Z.valueOf(16) : t;
  }
}

