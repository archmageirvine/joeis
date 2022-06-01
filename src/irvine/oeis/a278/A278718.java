package irvine.oeis.a278;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A278718 Numerators of A189733: periodic sequence repeating [0, 1, 1, 1, 0, -1].
 * @author Sean A. Irvine
 */
public class A278718 extends LinearRecurrence {

  /** Construct the sequence. */
  public A278718() {
    super(new long[] {1, -1, 1, -1, 1}, new long[] {0, 1, 1, 1, 0});
  }
}
