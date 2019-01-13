package irvine.oeis.a006;

/**
 * A006623.
 * @author Sean A. Irvine
 */
public class A006623 extends A006613 {

  @Override
  protected int cols() {
    return mN - 1;
  }

  @Override
  protected int init() {
    return 3;
  }
}

