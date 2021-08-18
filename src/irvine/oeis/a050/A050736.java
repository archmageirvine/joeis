package irvine.oeis.a050;

/**
 * A050736 Numbers of form 6^k (values of k see A050727) containing no pair of consecutive equal digits (probably finite).
 * @author Sean A. Irvine
 */
public class A050736 extends A050733 {

  @Override
  protected long multiplier() {
    return 6;
  }
}

