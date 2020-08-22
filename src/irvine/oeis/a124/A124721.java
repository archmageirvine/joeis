package irvine.oeis.a124;

import irvine.oeis.LinearRecurrence;

/**
 * A124721 Number of ternary Lyndon words with exactly three 1's.
 * @author Sean A. Irvine
 */
public class A124721 extends LinearRecurrence {

  /** Construct the sequence. */
  public A124721() {
    super(new long[] {-16, 24, -12, 10, -12, 6}, new long[] {2, 8, 26, 80, 224, 596});
  }
}
