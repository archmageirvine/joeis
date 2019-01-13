package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157443.
 * @author Sean A. Irvine
 */
public class A157443 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157443() {
    super(new long[] {1, -3, 3}, new long[] {86, 411, 978});
  }
}
