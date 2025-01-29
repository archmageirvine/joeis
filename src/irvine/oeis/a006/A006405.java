package irvine.oeis.a006;

/**
 * A006405 Number of unsensed 2-connected maps with n edges and without faces of degree 2.
 * @author Sean A. Irvine
 */
public class A006405 extends A006393 {

  {
    setOffset(3);
    skip(3);
  }

  @Override
  protected boolean reject(final int e) {
    return super.reject(e) || A006403.hasCutVertex(e, mS);
  }
}
