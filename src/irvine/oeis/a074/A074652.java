package irvine.oeis.a074;

/**
 * A074652 1/n * sum over d|n of {mu(n/d) * (4d)! / d!^4}.
 * @author Sean A. Irvine
 */
public class A074652 extends A074651 {

  @Override
  protected int scale() {
    return 4;
  }
}
