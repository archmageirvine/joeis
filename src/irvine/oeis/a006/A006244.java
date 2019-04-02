package irvine.oeis.a006;

import irvine.oeis.LinearRecurrence;

/**
 * A006244 Hexagonal numbers (A000384) which are also centered hexagonal numbers (A003215).
 * @author Sean A. Irvine
 */
public class A006244 extends LinearRecurrence {

  /** Construct the sequence. */
  public A006244() {
    super(new long[] {1, -99, 99}, new long[] {1, 91, 8911});
  }
}
