package irvine.oeis.a006;

/**
 * A006620.
 * @author Sean A. Irvine
 */
public class A006620 extends A006613 {

  @Override
  protected int j() {
    return 2;
  }

  @Override
  protected int cols() {
    return mN + 1;
  }
}

