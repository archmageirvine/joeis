package irvine.oeis.a006;

/**
 * A006407 Number of unsensed 2-connected simple planar maps with n edges.
 * @author Sean A. Irvine
 */
public class A006407 extends A006395 {

  {
    setOffset(3);
    next();
    next();
  }

  @Override
  protected boolean reject(final int e) {
    return super.reject(e) || A006403.hasCutVertex(e, mS);
  }
}
