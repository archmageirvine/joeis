package irvine.oeis.a159;
// Generated by gen_seq4.pl holos at 2021-06-02 19:27
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A159748 If an array is made of columns of -nacci sequences, fibo-, tribo- etc. all starting w. 1,1,2 etc, the NW to SE diagonals can be extended by computation. The above is diagonal 11. See A159741 for details.
 * Recurrence: a(n)=3*a(n-1)-2*a(n-2)
 * @author Georg Fischer
 */
public class A159748 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A159748() {
    super(1, "[[0],[-2],[3],[-1]]", "144, 927, 2872, 6930, 15109, 31489, 64256, 129792", 0);
  }
}
