package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016970.
 * @author Sean A. Irvine
 */
public class A016970 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016970() {
    super(new long[] {1, -3, 3}, new long[] {25, 121, 289});
  }
}
