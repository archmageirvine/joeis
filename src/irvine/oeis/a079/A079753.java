package irvine.oeis.a079;
// Generated by gen_seq4.pl 2024-05-13/multrar at 2024-05-13 22:33

import irvine.oeis.transform.MultiTransformSequence;

/**
 * A079753 Operation count to create all permutations of n distinct elements using the "streamlined" version of Algorithm L (lexicographic permutation generation) from Knuth's The Art of Computer Programming, Vol. 4, chapter 7.2.1.2. Sequence gives total executions of step L3.1'.
 * @author Georg Fischer
 */
public class A079753 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A079753() {
    super(3, (self, n) -> self.a(n - 1).multiply(n).add((long) (n - 1) * (n - 2) / 2), "0");
  }
}
