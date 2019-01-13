package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157670.
 * @author Sean A. Irvine
 */
public class A157670 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157670() {
    super(new long[] {1, -3, 3}, new long[] {258065, 1530170, 3865157});
  }
}
