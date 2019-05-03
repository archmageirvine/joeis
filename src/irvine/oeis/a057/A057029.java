package irvine.oeis.a057;

import irvine.oeis.LinearRecurrence;

/**
 * A057029 Central column of arrays in <code>A057027</code> and <code>A057028</code>.
 * @author Sean A. Irvine
 */
public class A057029 extends LinearRecurrence {

  /** Construct the sequence. */
  public A057029() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {1, 6, 12, 27, 39});
  }
}
