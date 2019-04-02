package irvine.oeis.a000;

/**
 * A000968 Sum of odd Fermat coefficients rounded to nearest integer.
 * @author Sean A. Irvine
 */
public class A000968 extends A000967 {

  @Override
  protected long step(final long c) {
    return c + 2;
  }
}
