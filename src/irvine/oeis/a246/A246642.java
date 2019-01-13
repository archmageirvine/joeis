package irvine.oeis.a246;

import irvine.oeis.LinearRecurrence;

/**
 * A246642.
 * @author Sean A. Irvine
 */
public class A246642 extends LinearRecurrence {

  /** Construct the sequence. */
  public A246642() {
    super(new long[] {1, -19, 19}, new long[] {1, 41, 761});
  }
}
