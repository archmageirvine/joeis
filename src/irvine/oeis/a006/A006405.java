package irvine.oeis.a006;

/**
 * A006405.
 * @author Sean A. Irvine
 */
public class A006405 extends A006393 {

  {
    next();
  }

  @Override
  protected boolean reject(final int e) {
    return super.reject(e) || A006403.hasCutVertex(e, mS);
  }
}
