package irvine.oeis.a072;

/**
 * A072069 Number of integer solutions to the equation 2x^2+y^2+32z^2=m for an odd number m=2n-1.
 * @author Sean A. Irvine
 */
public class A072069 extends A072068 {

  @Override
  protected long getN(final long x, final long y, final long z) {
    return 2 * x * x + y * y + 32 * z * z;
  }
}
