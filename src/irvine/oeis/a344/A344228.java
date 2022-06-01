package irvine.oeis.a344;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A344228 a(n) = binomial(2*n,n)*(2*n+1)/2+n*binomial(2*n-2,n)+(n-1)*binomial(2*n-2,n+1).
 * @author Georg Fischer
 */
public class A344228 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A344228() {
    super(1, "[[0],[-6, 10,-4, 12,-8],[-4, 3, 1,-4, 2]]", "[3]", 0);
  }

}
