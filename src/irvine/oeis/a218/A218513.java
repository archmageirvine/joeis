package irvine.oeis.a218;
// Generated by gen_seq4.pl holos [[0,1111968,-7171160,22594964,-46655060,71159652,-85371335,83530946,-68090965,46805540,-27292965,13518806,-5673571,2004600,-589875,142194,-27393,4060,-435,30,-1],[1]] [0,0] 0 at 2020-03-14 22:45
// Recurrence: a[n+0]=n*(n-1)(n-2)(n^17-27*n^16+352*n^15-2950*n^14+17839*n^13-82777*n^12+305866*n^11-921448*n^10+2297495*n^9-4783425*n^8+8347700*n^7-12195590*n^6+14808795*n^5-14713381*n^4+11613602*n^3-6892084*n^2+2751604*n-555984)
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A218513 Number of n-colorings of the dodecahedral graph.
 * @author Georg Fischer
 */
public class A218513 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A218513() {
    super(0, "[[0,1111968,-7171160,22594964,-46655060,71159652,-85371335,83530946,-68090965,46805540,-27292965,13518806,-5673571,2004600,-589875,142194,-27393,4060,-435,30,-1],[1]]", "[0,0]", 0);
  }
}
