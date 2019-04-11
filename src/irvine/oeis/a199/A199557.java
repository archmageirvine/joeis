package irvine.oeis.a199;

import irvine.oeis.LinearRecurrence;

/**
 * A199557 <code>10*8^n+1</code>.
 * @author Sean A. Irvine
 */
public class A199557 extends LinearRecurrence {

  /** Construct the sequence. */
  public A199557() {
    super(new long[] {-8, 9}, new long[] {11, 81});
  }
}
