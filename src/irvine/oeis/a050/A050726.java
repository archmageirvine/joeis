package irvine.oeis.a050;

/**
 * A050726 Decimal expansion of 5^n contains no pair of consecutive equal digits (probably finite).
 * @author Sean A. Irvine
 */
public class A050726 extends A050724 {

  /** Construct the sequence. */
  public A050726() {
    super(0);
  }

  @Override
  protected long multiplier() {
    return 5;
  }
}

