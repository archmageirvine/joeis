package irvine.oeis.a057;

import irvine.oeis.LinearRecurrence;

/**
 * A057703 Answer to the question: if you have a tall building and 5 plates and you need to find the highest story, a plate thrown from which does not break, what is the number of stories you can handle given n tries?.
 * @author Sean A. Irvine
 */
public class A057703 extends LinearRecurrence {

  /** Construct the sequence. */
  public A057703() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {0, 1, 3, 7, 15, 31});
  }
}
