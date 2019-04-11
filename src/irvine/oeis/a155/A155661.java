package irvine.oeis.a155;

import irvine.oeis.LinearRecurrence;

/**
 * A155661 <code>10^n-7^n+1</code>.
 * @author Sean A. Irvine
 */
public class A155661 extends LinearRecurrence {

  /** Construct the sequence. */
  public A155661() {
    super(new long[] {70, -87, 18}, new long[] {1, 4, 52});
  }
}
