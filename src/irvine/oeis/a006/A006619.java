package irvine.oeis.a006;

/**
 * A006619 Zarankiewicz's problem.
 * @author Sean A. Irvine
 */
public class A006619 extends A006614 {

  {
    setOffset(2);
  }

  @Override
  protected int init() {
    return 1;
  }

  @Override
  protected int cols() {
    return mN + 2;
  }
}

