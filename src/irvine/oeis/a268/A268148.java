package irvine.oeis.a268;

import irvine.oeis.LinearRecurrence;

/**
 * A268148.
 * @author Sean A. Irvine
 */
public class A268148 extends LinearRecurrence {

  /** Construct the sequence. */
  public A268148() {
    super(new long[] {4096, -768, 48}, new long[] {0, 8, 768});
  }
}
