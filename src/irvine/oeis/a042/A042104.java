package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042104 Numerators of continued fraction convergents to sqrt(577).
 * @author Sean A. Irvine
 */
public class A042104 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042104() {
    super(new long[] {1, 48}, new long[] {24, 1153});
  }
}
