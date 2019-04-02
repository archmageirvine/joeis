package irvine.oeis.a121;

import irvine.oeis.LinearRecurrence;

/**
 * A121199 12n+7^n+5^n.
 * @author Sean A. Irvine
 */
public class A121199 extends LinearRecurrence {

  /** Construct the sequence. */
  public A121199() {
    super(new long[] {-35, 82, -60, 14}, new long[] {2, 24, 98, 504});
  }
}
