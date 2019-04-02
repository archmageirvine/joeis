package irvine.oeis.a155;

import irvine.oeis.LinearRecurrence;

/**
 * A155635 8^n+5^n-1.
 * @author Sean A. Irvine
 */
public class A155635 extends LinearRecurrence {

  /** Construct the sequence. */
  public A155635() {
    super(new long[] {40, -53, 14}, new long[] {1, 12, 88});
  }
}
