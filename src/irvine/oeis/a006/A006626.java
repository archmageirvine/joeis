package irvine.oeis.a006;

/**
 * A006626 Zarankiewicz's problem k_4(n,n+1).
 * @author Sean A. Irvine
 */
public class A006626 extends A006616 {

  @Override
  protected int cols() {
    return mN + 1;
  }
}

