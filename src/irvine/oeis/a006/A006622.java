package irvine.oeis.a006;

/**
 * A006622.
 * @author Sean A. Irvine
 */
public class A006622 extends A006615 {

  @Override
  protected int init() {
    return 2;
  }

  @Override
  protected int cols() {
    return mN + 1;
  }
}

