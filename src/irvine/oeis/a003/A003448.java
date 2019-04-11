package irvine.oeis.a003;

/**
 * A003448 Number of nonequivalent dissections of an n-gon into <code>n-4</code> polygons by nonintersecting diagonals rooted at a cell up to rotation and reflection.
 * @author Sean A. Irvine
 */
public class A003448 extends A003447 {

  @Override
  protected int s() {
    return mN + 4;
  }
}

