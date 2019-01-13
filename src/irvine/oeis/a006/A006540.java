package irvine.oeis.a006;

/**
 * A006540.
 * @author Sean A. Irvine
 */
public class A006540 extends A006538 {

  @Override
  protected long v(final long a, final long k) {
    return (k - a % k) % k;
  }
}
