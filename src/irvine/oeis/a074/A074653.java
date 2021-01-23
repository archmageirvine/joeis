package irvine.oeis.a074;

/**
 * A074653 1/n * sum over d|n of {mu(n/d) * (5d)! / d!^5}.
 * @author Sean A. Irvine
 */
public class A074653 extends A074651 {

  @Override
  protected int scale() {
    return 5;
  }
}
