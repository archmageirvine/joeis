package irvine.oeis.a389;

/**
 * A389504 allocated for Stefano Spezia.
 * @author Sean A. Irvine
 */
public class A389504 extends A389428 {

  @Override
  protected long m(final int i, final int j, final int n) {
    return (i <= j ? 1 : n) + Math.abs(i - j);
  }
}
