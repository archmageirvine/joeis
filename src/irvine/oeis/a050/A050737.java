package irvine.oeis.a050;

/**
 * A050737 Numbers of form 7^k (values of k see A050728) containing no pair of consecutive equal digits (probably finite).
 * @author Sean A. Irvine
 */
public class A050737 extends A050733 {

  @Override
  protected long multiplier() {
    return 7;
  }
}

