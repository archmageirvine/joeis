package irvine.oeis.a029;

/**
 * A029904 <code>q(n)</code>, where exists one-parameter family of strategic partitions <code>(k+p(n)+q(n), k+q(n), r(n))</code> for k <code>= 0,1,2,..</code>. in Chomp.
 * @author Sean A. Irvine
 */
public class A029904 extends A029903 {

  @Override
  protected int select(final int c, final int q0, final int r) {
    return q0;
  }
}
