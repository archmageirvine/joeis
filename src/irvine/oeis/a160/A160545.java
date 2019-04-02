package irvine.oeis.a160;

import irvine.oeis.LinearRecurrence;

/**
 * A160545 Coprime to 21.
 * @author Sean A. Irvine
 */
public class A160545 extends LinearRecurrence {

  /** Construct the sequence. */
  public A160545() {
    super(new long[] {-1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1}, new long[] {1, 2, 4, 5, 8, 10, 11, 13, 16, 17, 19, 20, 22});
  }
}
