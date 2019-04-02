package irvine.oeis.a046;

import irvine.oeis.LinearRecurrence;

/**
 * A046634 Number of cubic residues mod 6^n.
 * @author Sean A. Irvine
 */
public class A046634 extends LinearRecurrence {

  /** Construct the sequence. */
  public A046634() {
    super(new long[] {-1296, 216, 0, 1506, -251, 0, -216, 36, 0, 6}, new long[] {1, 6, 9, 35, 210, 1083, 6253, 37518, 222705, 1331099});
  }
}
