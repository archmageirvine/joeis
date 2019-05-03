package irvine.oeis.a074;

/**
 * A074652 <code>1/n *</code> sum over <code>d|n</code> of <code>{mu(n/d) * (4d)! / d!^4}</code>.
 * @author Sean A. Irvine
 */
public class A074652 extends A074651 {

  @Override
  protected int scale() {
    return 4;
  }
}
