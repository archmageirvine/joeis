package irvine.oeis.a146;

import irvine.oeis.LinearRecurrence;

/**
 * A146312.
 * @author Sean A. Irvine
 */
public class A146312 extends LinearRecurrence {

  /** Construct the sequence. */
  public A146312() {
    super(new long[] {1, -99, 99}, new long[] {2, 242, 23762});
  }
}
