package irvine.oeis.a050;

/**
 * A050730 Decimal expansion of 9^n contains no pair of consecutive equal digits (probably finite).
 * @author Sean A. Irvine
 */
public class A050730 extends A050724 {

  /** Construct the sequence. */
  public A050730() {
    super(0);
  }

  @Override
  protected long multiplier() {
    return 9;
  }
}

