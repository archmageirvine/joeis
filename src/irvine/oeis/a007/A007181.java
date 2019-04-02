package irvine.oeis.a007;

/**
 * A007181 Expansion of critical exponent for walks on tetrahedral lattice.
 * @author Sean A. Irvine
 */
public class A007181 extends A007180 {

  @Override
  protected long count(final long point) {
    return t(point) == z(point) ? 1 : 0;
  }
}
