package irvine.oeis.a020;

import irvine.oeis.LinearRecurrence;

/**
 * A020968.
 * @author Sean A. Irvine
 */
public class A020968 extends LinearRecurrence {

  /** Construct the sequence. */
  public A020968() {
    super(new long[] {616, -221, 26}, new long[] {1, 26, 455});
  }
}
