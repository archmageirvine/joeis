package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041086 Numerators of continued fraction convergents to sqrt(51).
 * @author Sean A. Irvine
 */
public class A041086 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041086() {
    super(new long[] {-1, 0, 100, 0}, new long[] {7, 50, 707, 4999});
  }
}
