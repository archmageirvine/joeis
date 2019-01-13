package irvine.oeis.a108;

import irvine.oeis.LinearRecurrence;

/**
 * A108487.
 * @author Sean A. Irvine
 */
public class A108487 extends LinearRecurrence {

  /** Construct the sequence. */
  public A108487() {
    super(new long[] {-100, 200, -80, 20}, new long[] {1, 10, 110, 1600});
  }
}
