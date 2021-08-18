package irvine.oeis.a050;

/**
 * A050740 Numbers of form 11^k (values of k see A050731) containing no pair of consecutive equal digits (probably finite).
 * @author Sean A. Irvine
 */
public class A050740 extends A050733 {

  @Override
  protected long multiplier() {
    return 11;
  }
}

