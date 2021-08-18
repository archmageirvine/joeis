package irvine.oeis.a050;

/**
 * A050738 Numbers of form 8^k (values of k see A050729) containing no pair of consecutive equal digits (probably finite).
 * @author Sean A. Irvine
 */
public class A050738 extends A050733 {

  @Override
  protected long multiplier() {
    return 8;
  }
}

