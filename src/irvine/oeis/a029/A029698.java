package irvine.oeis.a029;

import irvine.oeis.LinearRecurrence;

/**
 * A029698.
 * @author Sean A. Irvine
 */
public class A029698 extends LinearRecurrence {

  /** Construct the sequence. */
  public A029698() {
    super(new long[] {10000, -3000, 129}, new long[] {10, 340, 20860});
  }
}
