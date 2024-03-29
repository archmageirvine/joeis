package irvine.oeis.a151;
// Generated by gen_seq4.pl holos at 2021-06-02 19:27
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A151651 Number of permutations of 6 indistinguishable copies of 1..n with exactly 2 adjacent element pairs in decreasing order.
 * Lin.rec. signature: (45,-570, 2822,-5481, 4557,-1372)
 * @author Georg Fischer
 */
public class A151651 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A151651() {
    super(1, "[0,-1372, 4557,-5481, 2822,-570, 45,-1]", "0, 225, 15606, 554931, 16689816, 477537957, 13457517066, 377519524263, 10576236506508, 296179535707065, 8293376986582302, 232217254675249371", 0);
  }
}
