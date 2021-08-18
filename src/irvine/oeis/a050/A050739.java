package irvine.oeis.a050;

/**
 * A050739 Numbers of form 9^k (values of k see A050730) containing no pair of consecutive equal digits (probably finite).
 * @author Sean A. Irvine
 */
public class A050739 extends A050733 {

  @Override
  protected long multiplier() {
    return 9;
  }
}

