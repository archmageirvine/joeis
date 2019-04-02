package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041112 Numerators of continued fraction convergents to sqrt(65).
 * @author Sean A. Irvine
 */
public class A041112 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041112() {
    super(new long[] {1, 16}, new long[] {8, 129});
  }
}
