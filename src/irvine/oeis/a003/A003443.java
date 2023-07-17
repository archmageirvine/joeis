package irvine.oeis.a003;

import irvine.math.z.Z;

/**
 * A003443 Number of nonequivalent dissections of an n-gon into n-4 polygons by nonintersecting diagonals rooted at a cell up to rotation.
 * @author Sean A. Irvine
 */
public class A003443 extends A003442 {

  /** Construct the sequence. */
  public A003443() {
    super(5);
  }

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return f(mN, mN + 4).coeff(mN + 4).toZ();
  }
}

