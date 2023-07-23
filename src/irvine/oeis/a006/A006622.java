package irvine.oeis.a006;

/**
 * A006622 Zarankiewicz's problem.
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

