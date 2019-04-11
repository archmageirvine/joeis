package irvine.oeis.a003;

import irvine.math.z.Z;

/**
 * A003443 Number of nonequivalent dissections of an n-gon into <code>n-4</code> polygons by nonintersecting diagonals rooted at a cell up to rotation.
 * @author Sean A. Irvine
 */
public class A003443 extends A003442 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return f(mN, mN + 4).coeff(mN + 4).toZ();
  }
}

