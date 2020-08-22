package irvine.oeis.a098;

import irvine.oeis.LinearRecurrence;

/**
 * A098994 Number of permutations of [n] with exactly 3 descents which avoid the pattern 1324.
 * @author Sean A. Irvine
 */
public class A098994 extends LinearRecurrence {

  /** Construct the sequence. */
  public A098994() {
    super(new long[] {-1, 12, -66, 220, -495, 792, -924, 792, -495, 220, -66, 12}, new long[] {0, 0, 0, 1, 26, 229, 1246, 5086, 17084, 49768, 129958, 311051});
  }
}
