package irvine.oeis.a006;

import irvine.oeis.LinearRecurrence;

/**
 * A006244 Hexagonal numbers <code>(A000384)</code> which are also centered hexagonal numbers <code>(A003215)</code>.
 * @author Sean A. Irvine
 */
public class A006244 extends LinearRecurrence {

  /** Construct the sequence. */
  public A006244() {
    super(new long[] {1, -99, 99}, new long[] {1, 91, 8911});
  }
}
