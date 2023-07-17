package irvine.oeis.a050;

/**
 * A050728 Decimal expansion of 7^n contains no pair of consecutive equal digits (probably finite).
 * @author Sean A. Irvine
 */
public class A050728 extends A050724 {

  /** Construct the sequence. */
  public A050728() {
    super(0);
  }

  @Override
  protected long multiplier() {
    return 7;
  }
}

