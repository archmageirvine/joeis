package irvine.oeis.a176;

import irvine.oeis.LinearRecurrence;

/**
 * A176711.
 * @author Sean A. Irvine
 */
public class A176711 extends LinearRecurrence {

  /** Construct the sequence. */
  public A176711() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {21, 285, 1365, 4221, 10197});
  }
}
