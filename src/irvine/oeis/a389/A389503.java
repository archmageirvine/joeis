package irvine.oeis.a389;

/**
 * A389503 allocated for Stefano Spezia.
 * @author Sean A. Irvine
 */
public class A389503 extends A389427 {

  @Override
  protected long m(final int i, final int j, final int n) {
    return (i <= j ? 1 : n) + Math.abs(i - j);
  }
}
