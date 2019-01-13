package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157863.
 * @author Sean A. Irvine
 */
public class A157863 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157863() {
    super(new long[] {1, -3, 3}, new long[] {103708801, 414777601, 933206401});
  }
}
