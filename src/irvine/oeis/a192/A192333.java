package irvine.oeis.a192;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A192333 Numbers that are "unsafe" when playing the game Dollar Nim, which is a Nim game where users can remove 1, 5, 10, or 25 cents from an initial pile of money. The most common version of the game is played with an initial amount of $1, hence the name.
 * @author Sean A. Irvine
 */
public class A192333 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192333() {
    super(1, new long[] {-1, 1, 0, 0, 0, 1}, new long[] {0, 2, 4, 6, 8, 15});
  }
}
