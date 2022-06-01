package irvine.oeis.a057;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A057788 Expansion of (1+x)/(1-x)^12.
 * @author Sean A. Irvine
 */
public class A057788 extends LinearRecurrence {

  /** Construct the sequence. */
  public A057788() {
    super(new long[] {-1, 12, -66, 220, -495, 792, -924, 792, -495, 220, -66, 12}, new long[] {1, 13, 90, 442, 1729, 5733, 16744, 44200, 107406, 243542, 520676, 1058148});
  }
}
