package irvine.oeis.a006;

/**
 * A006625 A variant of Zarankiewicz's problem: a(n) is the least k such that every n X (n+2) {0,1}-matrix with k ones contains an all-ones 3 X 4 submatrix.
 * @author Sean A. Irvine
 */
public class A006625 extends A006615 {

  {
    setOffset(3);
  }

  @Override
  protected int init() {
    return 2;
  }

  @Override
  protected int cols() {
    return mN + 2;
  }
}

