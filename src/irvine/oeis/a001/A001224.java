package irvine.oeis.a001;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A001224 If F(n) is the n-th Fibonacci number, then a(2n) = (F(2n+1) + F(n+2))/2 and a(2n+1) = (F(2n+2) + F(n+1))/2.
 * @author Georg Fischer
 */
public class A001224 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A001224() {
    super(1, "[0,-1,-1,0,-1,2,1,-1]", "1,2,2,4,5,9", 0);
  }
}
