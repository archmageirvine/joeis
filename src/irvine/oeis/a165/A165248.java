package irvine.oeis.a165;

import irvine.oeis.LinearRecurrence;

/**
 * A165248 Quintisection A061037(5*n+2).
 * @author Sean A. Irvine
 */
public class A165248 extends LinearRecurrence {

  /** Construct the sequence. */
  public A165248() {
    super(new long[] {1, 0, 0, 0, -3, 0, 0, 0, 3, 0, 0, 0}, new long[] {0, 45, 35, 285, 30, 725, 255, 1365, 110, 2205, 675, 3245});
  }
}
