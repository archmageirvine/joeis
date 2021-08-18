package irvine.oeis.a050;

/**
 * A050729 Decimal expansion of 8^n contains no pair of consecutive equal digits (probably finite).
 * @author Sean A. Irvine
 */
public class A050729 extends A050724 {

  @Override
  protected long multiplier() {
    return 8;
  }
}

