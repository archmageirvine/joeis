package irvine.oeis.a050;

/**
 * A050725 Decimal expansion of 4^n contains no pair of consecutive equal digits (probably finite).
 * @author Sean A. Irvine
 */
public class A050725 extends A050724 {

  @Override
  protected long multiplier() {
    return 4;
  }
}

