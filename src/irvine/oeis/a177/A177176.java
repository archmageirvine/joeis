package irvine.oeis.a177;
// Generated by gen_seq4.pl holos [[-50,12,-1],[-1],[0],[0],[0],[0],[0],[0],[0],[0],[0],[0],[0],[0],[1]] [0,0,0,1,2,4,7,11,16,22,30,39,50,63] 0 at 2020-03-14 22:45
// Recurrence: a[n+0]=a[n-13]+(n+1)*(n-13)+63
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A177176 Partial sums of round(n^2/13).
 * @author Georg Fischer
 */
public class A177176 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A177176() {
    super(0, "[[-50,12,-1],[-1],[0],[0],[0],[0],[0],[0],[0],[0],[0],[0],[0],[0],[1]]", "[0,0,0,1,2,4,7,11,16,22,30,39,50,63]", 0);
  }
}
