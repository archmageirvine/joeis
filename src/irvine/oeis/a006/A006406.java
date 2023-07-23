package irvine.oeis.a006;

/**
 * A006406 Number of 2-connected planar maps with n edges (see reference for precise definition).
 * @author Sean A. Irvine
 */
public class A006406 extends A006394 {

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
