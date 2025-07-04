package irvine.oeis.a189;
// Generated by gen_seq4.pl 2025-06-22.ack/holos at 2025-06-22 22:11

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A189886 a(n) is the number of compositions of the set {1, 2, ..., n} into blocks, each of size 1, 2 or 3 (n &gt;= 0).
 * @author Georg Fischer
 */
public class A189886 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A189886() {
    super(0, "[[0],[1],[3],[6],[-6]]", "1", 0, 1);
  }
}
