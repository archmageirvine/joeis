package irvine.oeis.a336;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A336114 The hafnian of a symmetric Toeplitz matrix of order 2*n, n&gt;=2 with the first row (0,1,2,...,2,1); a(0)=a(1)=1.
 * @author Georg Fischer
 */
public class A336114 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A336114() {
    super(0, "[[0],[1,2],[0,0,8],[1,-2]]", "1,1,6,64", 1);
  }
}
