package irvine.oeis.a006;

/**
 * A006619.
 * @author Sean A. Irvine
 */
public class A006619 extends A006614 {

  @Override
  protected int init() {
    return 1;
  }

  @Override
  protected int cols() {
    return mN + 2;
  }
}

