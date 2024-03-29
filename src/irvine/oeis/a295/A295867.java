package irvine.oeis.a295;
// manually verified, 2023-04-29

import irvine.oeis.recur.LinearRecurrence;

/**
 * A295867 Numbers of the form A000217(n)*A007494(n) that are divisible by 3.
 * @author Georg Fischer
 */
public class A295867 extends LinearRecurrence {

  /** Construct the sequence. */
  public A295867() {
    super(new long[] {-1L, 1L, 0L, 0L, 0L, 3L, -3L, 0L, 0L, 0L, -3L, 3L, 0L, 0L, 0L, 1L},
      new long[] {9L, 30L, 60L, 120L, 189L, 432L, 630L, 825L, 1122L, 1404L, 2205L, 2760L, 3264L, 3978L, 4617L, 6300L}, 0L);
  } // constructor()
} // A295867
