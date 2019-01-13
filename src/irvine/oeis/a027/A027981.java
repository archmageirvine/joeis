package irvine.oeis.a027;

import irvine.oeis.LinearRecurrence;

/**
 * A027981.
 * @author Sean A. Irvine
 */
public class A027981 extends LinearRecurrence {

  /** Construct the sequence. */
  public A027981() {
    super(new long[] {4, -8, 5}, new long[] {1, 10, 40});
  }
}
