package irvine.oeis.a006;

/**
 * A006622 A variant of Zarankiewicz's problem: a(n) is the least k such that every n X (n+1) {0,1}-matrix with k ones contains an all-ones 3 X 4 submatrix.
 * @author Sean A. Irvine
 */
public class A006622 extends A006615 {

  {
    setOffset(3);
  }

  @Override
  protected int init() {
    return 2;
  }

  @Override
  protected int cols() {
    return mN + 1;
  }
}

