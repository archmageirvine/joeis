package irvine.oeis.a006;

/**
 * A006621 Zarankiewicz's problem k_3(n,n+1).
 * @author Sean A. Irvine
 */
public class A006621 extends A006615 {

  {
    setOffset(3);
  }

  @Override
  protected int j() {
    return 3;
  }

  @Override
  protected int cols() {
    return mN + 1;
  }
}

