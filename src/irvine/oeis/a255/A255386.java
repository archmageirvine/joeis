package irvine.oeis.a255;

import irvine.oeis.LinearRecurrence;

/**
 * A255386 Number of binary words of length n with exactly one occurrence of subword 010 and exactly one occurrence of subword 101.
 * @author Sean A. Irvine
 */
public class A255386 extends LinearRecurrence {

  /** Construct the sequence. */
  public A255386() {
    super(new long[] {1, 2, -2, -2, 5, -2, -4, 4}, new long[] {0, 0, 0, 0, 2, 4, 10, 20});
  }
}
