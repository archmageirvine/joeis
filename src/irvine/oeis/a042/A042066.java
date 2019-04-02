package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042066 Numerators of continued fraction convergents to sqrt(557).
 * @author Sean A. Irvine
 */
public class A042066 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042066() {
    super(new long[] {1, 0, 0, 0, 0, 236, 0, 0, 0, 0}, new long[] {23, 24, 47, 71, 118, 5499, 5617, 11116, 16733, 27849});
  }
}
