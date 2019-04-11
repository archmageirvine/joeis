package irvine.oeis.a074;

/**
 * A074652 <code>1/n *</code> sum over d|n of {mu(n/d) * (4d)! / d!^4}.
 * @author Sean A. Irvine
 */
public class A074652 extends A074651 {

  @Override
  protected int scale() {
    return 4;
  }
}
