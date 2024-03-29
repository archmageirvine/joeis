package irvine.oeis.a302;
// Generated by gen_seq4.pl holos at 2021-06-06 21:33
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A302909 Determinant of n X n matrix whose main diagonal consists of the first n 5-gonal numbers and all other elements are 1's.
 * 
 * @author Georg Fischer
 */
public class A302909 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A302909() {
    super(1, "[[0],[-2,-1, 3],[-2]]", "1", 0);
  }
}
