package irvine.oeis.a324;
// Generated by gen_seq4.pl holos [[0],[-10,4],[59,-64,16],[12,-8],[1]] [0,1,5,49,679] 0 at 2020-03-14 22:45
// Recurrence: a[n+0]=(8*n-12)*a[n-1]-(16*n^2-64*n+59)*a[n-2]-(4*n-10)*a[n-3]
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A324361 Total number of occurrences of n in the (signed) displacement sets of all permutations of [2n] divided by n!.
 * @author Georg Fischer
 */
public class A324361 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A324361() {
    super(0, "[[0],[-10,4],[59,-64,16],[12,-8],[1]]", "[0,1,5,49,679]", 0);
  }
}
