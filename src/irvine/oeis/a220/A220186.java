package irvine.oeis.a220;

import irvine.oeis.LinearRecurrence;

/**
 * A220186.
 * @author Sean A. Irvine
 */
public class A220186 extends LinearRecurrence {

  /** Construct the sequence. */
  public A220186() {
    super(new long[] {1, -99, 99}, new long[] {0, 8, 800});
  }
}
