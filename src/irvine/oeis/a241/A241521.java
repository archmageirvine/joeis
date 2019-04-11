package irvine.oeis.a241;

import irvine.oeis.LinearRecurrence;

/**
 * A241521 Numbers n such that <code>n^2 == -1 (mod 97)</code>.
 * @author Sean A. Irvine
 */
public class A241521 extends LinearRecurrence {

  /** Construct the sequence. */
  public A241521() {
    super(new long[] {-1, 1, 1}, new long[] {22, 75, 119});
  }
}
