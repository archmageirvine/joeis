package irvine.oeis.a278;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A278618 a(n) = Sum_{j=0..n/2} binomial(n-j-1,n-2*j)*binomial(2*n+1,j).
 * @author Georg Fischer
 */
public class A278618 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A278618() {
    super(0, "[[0],[648,-3132, 5148,-3312, 720],[120,-536, 700,-196,-40],[0, 82,-299, 344,-115],[0, 16,-26,-22, 20]]", "1, 0", 0);
  }
}
