package irvine.oeis.a054;

import irvine.oeis.LinearRecurrence;

/**
 * A054605 <code>a(n) =</code> Sum_{d|6} phi(d)*n^(6/d).
 * @author Sean A. Irvine
 */
public class A054605 extends LinearRecurrence {

  /** Construct the sequence. */
  public A054605() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {0, 6, 84, 780, 4200, 15810, 46956});
  }
}
