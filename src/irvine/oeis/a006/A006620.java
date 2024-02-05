package irvine.oeis.a006;

/**
 * A006620 A variant of Zarankiewicz's problem: a(n) is the least k such that every n X (n+1) {0,1}-matrix with k ones contains an all-ones 2 X 2 submatrix.
 * @author Sean A. Irvine
 */
public class A006620 extends A006613 {

  /** Construct the sequence. */
  public A006620() {
    super(2);
  }

  @Override
  protected int j() {
    return 2;
  }

  @Override
  protected int cols() {
    return mN + 1;
  }
}

