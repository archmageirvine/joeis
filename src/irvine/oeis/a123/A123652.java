package irvine.oeis.a123;
// Generated by gen_seq4.pl holos [[-1,0,-1,-1,0,-1,0,-1,0,0,0,-1,0,-1,0,0,0,-1,0,-1,0,0,0,-1,0,0,0,0,0,-1,0,-1,0,0,0,0,0,-1,0,0,0,-1],[1]] [14] 0 at 2020-03-14 22:45
// Recurrence: a[n+0]=1+n^2+n^3+n^5+n^7+n^11+n^13+n^17+n^19+n^23+n^29+n^31+n^37+n^41
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A123652 a(n) = 1 + n^2 + n^3 + n^5 + n^7 + n^11 + n^13 + n^17 + n^19 + n^23 + n^29 + n^31 + n^37 + n^41.
 * @author Georg Fischer
 */
public class A123652 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A123652() {
    super(1, "[[-1,0,-1,-1,0,-1,0,-1,0,0,0,-1,0,-1,0,0,0,-1,0,-1,0,0,0,-1,0,0,0,0,0,-1,0,-1,0,0,0,0,0,-1,0,0,0,-1],[1]]", "[14]", 0);
  }
}
