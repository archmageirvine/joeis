package irvine.oeis.a027;

import irvine.oeis.LinearRecurrence;

/**
 * A027557.
 * @author Sean A. Irvine
 */
public class A027557 extends LinearRecurrence {

  /** Construct the sequence. */
  public A027557() {
    super(new long[] {-2, -2, 3, 1}, new long[] {1, 2, 4, 8});
  }
}
