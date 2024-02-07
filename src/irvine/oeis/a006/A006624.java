package irvine.oeis.a006;

/**
 * A006624 a(n) is the least k such that every n X (n+3) {0,1}-matrix with k ones contains an all-ones 2 X 4 submatrix.
 * @author Sean A. Irvine
 */
public class A006624 extends A006614 {

  {
    setOffset(2);
  }

  @Override
  protected int init() {
    return 1;
  }

  @Override
  protected int cols() {
    return mN + 3;
  }
}

