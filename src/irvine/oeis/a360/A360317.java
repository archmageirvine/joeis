package irvine.oeis.a360;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A360317 a(n) = Sum_{k=0..n} 2^(n-k) * binomial(n-1,n-k) * binomial(2*k,k).
 * @author Georg Fischer
 */
public class A360317 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A360317() {
    super(0, "[[0],[24,-12],[-6,8],[0,-1]]", "1", 0);
  }
}
