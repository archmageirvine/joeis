package irvine.oeis.a087;

import irvine.oeis.LinearRecurrence;

/**
 * A087292.
 * @author Sean A. Irvine
 */
public class A087292 extends LinearRecurrence {

  /** Construct the sequence. */
  public A087292() {
    super(new long[] {27, -39, 13}, new long[] {0, 24, 384});
  }
}
