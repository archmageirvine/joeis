package irvine.oeis.a072;

/**
 * A072071.
 * @author Sean A. Irvine
 */
public class A072071 extends A072070 {

  @Override
  protected long getN(final long x, final long y, final long z) {
    return 4 * x * x + y * y + 32 * z * z;
  }
}
