package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042725 Denominators of continued fraction convergents to sqrt(892).
 * @author Sean A. Irvine
 */
public class A042725 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042725() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 200702, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 1, 7, 15, 217, 449, 2911, 3360, 197791, 201151, 1404697, 3010545, 43552327, 90115199, 584243521, 674358720});
  }
}
