package irvine.oeis.a003;

/**
 * A003997 Sum of distinct positive cubes.
 * @author Sean A. Irvine
 */
public class A003997 extends A003996 {

  @Override
  protected long power(final long b) {
    if (b > 2097151) {
      throw new UnsupportedOperationException();
    }
    return b * b * b;
  }

  @Override
  protected byte minCount() {
    return 0;
  }
}
