package irvine.oeis.a050;

/**
 * A050734 Numbers of form 4^k (values of k see A050725) containing no pair of consecutive equal digits (probably finite).
 * @author Sean A. Irvine
 */
public class A050734 extends A050733 {

  /** Construct the sequence. */
  public A050734() {
    super(1);
  }

  @Override
  protected long multiplier() {
    return 4;
  }
}

