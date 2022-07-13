package irvine.oeis.a057;

/**
 * A057893 Negabinary numbral multiplication table.
 * @author Sean A. Irvine
 */
public class A057893 extends A057892 {

  @Override
  protected long t(final long a, final long b) {
    return getNegBinary(getNatural(a) * getNatural(b));
  }
}

