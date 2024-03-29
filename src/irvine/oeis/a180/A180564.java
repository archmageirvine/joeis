package irvine.oeis.a180;
// Generated by gen_seq4.pl 2024-02-21/holos at 2024-02-21 19:48

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A180564 Number of permutations of [n] having no isolated entries. An entry j of a permutation p is isolated if it is not preceded by j-1 and not followed by j+1. For example, the permutation 23178564 has 2 isolated entries: 1 and 4.
 * @author Georg Fischer
 */
public class A180564 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A180564() {
    super(0, "[[0], [-4, 1], [3, -1], [-3, 1], [3], [-2]]", "1, 0, 1, 1", 0, 0);
  }
}
