package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042300 Numerators of continued fraction convergents to sqrt(677).
 * @author Sean A. Irvine
 */
public class A042300 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042300() {
    super(new long[] {1, 52}, new long[] {26, 1353});
  }
}
