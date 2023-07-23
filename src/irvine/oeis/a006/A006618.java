package irvine.oeis.a006;

/**
 * A006618 Zarankiewicz's problem.
 * @author Sean A. Irvine
 */
public class A006618 extends A006614 {

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

