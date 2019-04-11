package irvine.oeis.a156;

import irvine.oeis.FiniteSequence;

/**
 * A156068 The slowest increasing sequence such that there is no common digit between any two integers from <code>{a(n), a(n-1), a(n-2),</code> c=a(n)+a(n-1)+a(n-2)}.
 * @author Georg Fischer
 */
public class A156068 extends FiniteSequence {

  /** Construct the sequence. */
  public A156068() {
    super(1, 2, 3, 4, 5, 7, 8, 9, 10, 25, 33, 40, 55, 73, 81, 90, 262, 433, 880, 959, 2272, 3380, 5459, 7272);
  }
}
