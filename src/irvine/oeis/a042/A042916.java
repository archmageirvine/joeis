package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042916 Numerators of continued fraction convergents to sqrt(990).
 * @author Sean A. Irvine
 */
public class A042916 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042916() {
    super(new long[] {-1, 0, 0, 0, 1762, 0, 0, 0}, new long[] {31, 63, 409, 881, 55031, 110943, 720689, 1552321});
  }
}
