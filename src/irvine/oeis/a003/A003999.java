package irvine.oeis.a003;

/**
 * A003999 Sums of distinct nonzero 4th powers.
 * @author Sean A. Irvine
 */
public class A003999 extends A003996 {

  @Override
  protected long power(final long b) {
    if (b > 55108) {
      throw new UnsupportedOperationException();
    }
    final long s = b * b;
    return s * s;
  }

  @Override
  protected byte minCount() {
    return 0;
  }
}
