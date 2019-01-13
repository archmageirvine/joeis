package irvine.oeis.a072;

/**
 * A072069.
 * @author Sean A. Irvine
 */
public class A072069 extends A072068 {

  @Override
  protected long getN(final long x, final long y, final long z) {
    return 2 * x * x + y * y + 32 * z * z;
  }
}
