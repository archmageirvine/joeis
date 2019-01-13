package irvine.oeis.a131;

import irvine.oeis.LinearRecurrence;

/**
 * A131557.
 * @author Sean A. Irvine
 */
public class A131557 extends LinearRecurrence {

  /** Construct the sequence. */
  public A131557() {
    super(new long[] {1, -1, -322, 322, 1}, new long[] {55, 2485, 17020, 799480, 5479705});
  }
}
