package irvine.oeis.a072;

/**
 * A072071 Number of integer solutions to the equation <code>4x^2+y^2+32z^2=n</code>.
 * @author Sean A. Irvine
 */
public class A072071 extends A072070 {

  @Override
  protected long getN(final long x, final long y, final long z) {
    return 4 * x * x + y * y + 32 * z * z;
  }
}
