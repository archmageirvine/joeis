package irvine.oeis.a227;

import irvine.oeis.LinearRecurrence;

/**
 * A227273.
 * @author Sean A. Irvine
 */
public class A227273 extends LinearRecurrence {

  /** Construct the sequence. */
  public A227273() {
    super(new long[] {28000, -40000, 13510, -1579, 70}, new long[] {1, 70, 3321, 135450, 5143341});
  }
}
