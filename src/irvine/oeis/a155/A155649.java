package irvine.oeis.a155;

import irvine.oeis.LinearRecurrence;

/**
 * A155649 a(n) = 11^n+6^n-1^n.
 * @author Sean A. Irvine
 */
public class A155649 extends LinearRecurrence {

  /** Construct the sequence. */
  public A155649() {
    super(new long[] {66, -83, 18}, new long[] {1, 16, 156});
  }
}
