package irvine.oeis.a072;

/**
 * A072070 Number of integer solutions to the equation 4*x^2 + y^2 + 8*z^2 = n.
 * @author Sean A. Irvine
 */
public class A072070 extends A072068 {

  @Override
  protected long start() {
    return 0;
  }

  @Override
  protected long getN(final long x, final long y, final long z) {
    return 4 * x * x + y * y + 8 * z * z;
  }

  @Override
  protected boolean testN(final long n) {
    return true;
  }

  @Override
  protected long indexN(final long n) {
    return n;
  }

  @Override
  protected long xLimit(final long maxN) {
    return (long) Math.ceil(Math.sqrt(maxN >>> 3)) + 1;
  }

  @Override
  protected long yLimit(final long maxN) {
    return (long) Math.ceil(Math.sqrt(maxN >>> 1)) + 1;
  }

  @Override
  protected long zLimit(final long maxN) {
    return (long) Math.ceil(Math.sqrt(maxN >>> 4)) + 1;
  }

}
