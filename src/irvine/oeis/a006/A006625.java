package irvine.oeis.a006;

/**
 * A006625 Zarankiewicz's problem.
 * @author Sean A. Irvine
 */
public class A006625 extends A006615 {

  @Override
  protected int init() {
    return 2;
  }

  @Override
  protected int cols() {
    return mN + 2;
  }
}

