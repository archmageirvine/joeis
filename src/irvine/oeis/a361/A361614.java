package irvine.oeis.a361;
// manually holsig2/holos at 2023-08-08 18:53

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A361614 Set a(1)=0 and a(2)=1. For n &gt; 1, if a(n) has already appeared in the sequence, then a(n+1) = number of steps since its first appearance. If a(n) has not appeared before, search instead for a(n)-1, then a(n)-2, etc., until you find a number that has appear
 * @author Georg Fischer
 */
public class A361614 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A361614() {
    super(1, "[0,-1, 0, 2, 0,-1]", "0, 1, 1, 1, 2, 3, 1, 5, 2, 4, 4, 1, 10, 5, 6, 7, 1, 15, 5, 11, 7, 5, 14, 3, 18, 7, 10, 14, 5, 21, 5, 23, 2, 28, 2, 30", 0);
  }
}
