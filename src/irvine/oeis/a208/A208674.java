package irvine.oeis.a208;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A208674 Number of words, either empty or beginning with the first letter of the n-ary alphabet, where each letter of the alphabet occurs 3 times and letters of neighboring word positions are equal or neighbors in the alphabet.
 * @author Sean A. Irvine
 */
public class A208674 extends LinearRecurrence {

  /** Construct the sequence. */
  public A208674() {
    super(new long[] {4, -2, -14, -1, 5}, new long[] {1, 1, 10, 37, 163});
  }
}
