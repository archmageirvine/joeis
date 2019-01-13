package irvine.oeis.a020;

import irvine.oeis.LinearRecurrence;

/**
 * A020534.
 * @author Sean A. Irvine
 */
public class A020534 extends LinearRecurrence {

  /** Construct the sequence. */
  public A020534() {
    super(new long[] {-65536, 43520, -5712, 170}, new long[] {21, 408, 23184, 2298912});
  }
}
