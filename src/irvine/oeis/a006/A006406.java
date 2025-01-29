package irvine.oeis.a006;

/**
 * A006406 Number of sensed 2-connected simple planar maps with n edges.
 * @author Sean A. Irvine
 */
public class A006406 extends A006394 {

  {
    setOffset(3);
    skip(3);
  }

  @Override
  protected boolean reject(final int e) {
    return super.reject(e) || A006403.hasCutVertex(e, mS);
  }
}
