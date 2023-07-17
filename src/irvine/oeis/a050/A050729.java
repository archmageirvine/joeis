package irvine.oeis.a050;

/**
 * A050729 Decimal expansion of 8^n contains no pair of consecutive equal digits (probably finite).
 * @author Sean A. Irvine
 */
public class A050729 extends A050724 {

  /** Construct the sequence. */
  public A050729() {
    super(0);
  }

  @Override
  protected long multiplier() {
    return 8;
  }
}

