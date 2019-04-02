package irvine.oeis.a163;

import irvine.oeis.LinearRecurrence;

/**
 * A163942 Fifth right hand column of triangle A163940.
 * @author Sean A. Irvine
 */
public class A163942 extends LinearRecurrence {

  /** Construct the sequence. */
  public A163942() {
    super(new long[] {96, -224, 190, -75, 14}, new long[] {1, 14, 121, 834, 5037});
  }
}
