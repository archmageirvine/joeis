package irvine.oeis.a006;

/**
 * A006612 Number of n-node bipartite graphs not determined by their spectra.
 * @author Sean A. Irvine
 */
public class A006612 extends A006608 {

  @Override
  protected boolean bipartite() {
    return true;
  }
}
