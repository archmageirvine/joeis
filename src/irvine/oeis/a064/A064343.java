package irvine.oeis.a064;
// Generated by gen_seq4.pl holos [[0],[-750,500],[-1000,395],[4,-4]] [1,1,10,325] 0 at 2020-03-14 22:45
// Recurrence: 4*(-n+1)*a[n+0]+5*(79*n-200)*a[n-1]+250*(2*n-3)*a[n-2]=0
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A064343 Generalized Catalan numbers C(5,5; n).
 * @author Georg Fischer
 */
public class A064343 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A064343() {
    super(0, "[[0],[-750,500],[-1000,395],[4,-4]]", "[1,1,10,325]", 0);
  }
}
