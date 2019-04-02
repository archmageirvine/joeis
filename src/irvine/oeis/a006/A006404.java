package irvine.oeis.a006;

/**
 * A006404 Number of 2-connected maps without faces of degree 2.
 * @author Sean A. Irvine
 */
public class A006404 extends A006392 {

  {
    next();
  }

  @Override
  protected boolean reject(final int e) {
    return super.reject(e) || A006403.hasCutVertex(e, mS);
  }
}
