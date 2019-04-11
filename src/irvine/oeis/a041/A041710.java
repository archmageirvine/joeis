package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041710 Numerators of continued fraction convergents to <code>sqrt(375)</code>.
 * @author Sean A. Irvine
 */
public class A041710 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041710() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 30248, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {19, 39, 58, 155, 213, 1220, 1433, 4086, 5519, 15124, 580231, 1175586, 1755817, 4687220, 6443037, 36902405, 43345442, 123593289, 166938731, 457470751});
  }
}
