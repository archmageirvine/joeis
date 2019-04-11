package irvine.oeis.a168;

import irvine.oeis.LinearRecurrence;

/**
 * A168153 <code>a(n) = n^2*(n^9 + 1)/2</code>.
 * @author Sean A. Irvine
 */
public class A168153 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168153() {
    super(new long[] {-1, 12, -66, 220, -495, 792, -924, 792, -495, 220, -66, 12}, new long[] {0, 1, 1026, 88578, 2097160, 24414075, 181398546, 988663396, 4294967328L, 15690529845L, 50000000050L, 142655835366L});
  }
}
