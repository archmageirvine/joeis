package irvine.oeis.a066;

import irvine.oeis.LinearRecurrence;

/**
 * A066403.
 * @author Sean A. Irvine
 */
public class A066403 extends LinearRecurrence {

  /** Construct the sequence. */
  public A066403() {
    super(new long[] {-1, 42, -591, 2828, -591, 42}, new long[] {0, 1, 46, 1347, 32220, 686661});
  }
}
