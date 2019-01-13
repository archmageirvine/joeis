package irvine.oeis.a094;

import irvine.oeis.LinearRecurrence;

/**
 * A094026.
 * @author Sean A. Irvine
 */
public class A094026 extends LinearRecurrence {

  /** Construct the sequence. */
  public A094026() {
    super(new long[] {-10, 0, 11, 0}, new long[] {0, 1, 10, 11});
  }
}
