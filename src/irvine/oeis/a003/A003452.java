package irvine.oeis.a003;

/**
 * A003452 Number of nonequivalent dissections of an n-gon into 3 polygons by nonintersecting diagonals rooted at a cell up to rotation and reflection.
 * @author Sean A. Irvine
 */
public class A003452 extends A003447 {

  @Override
  protected int s() {
    return mN + 4;
  }

  @Override
  protected int r() {
    return 3;
  }
}

