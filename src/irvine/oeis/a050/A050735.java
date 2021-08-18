package irvine.oeis.a050;

/**
 * A050735 Numbers of form 5^k (values of k see A050726) containing no pair of consecutive equal digits (probably finite).
 * @author Sean A. Irvine
 */
public class A050735 extends A050733 {

  @Override
  protected long multiplier() {
    return 5;
  }
}

