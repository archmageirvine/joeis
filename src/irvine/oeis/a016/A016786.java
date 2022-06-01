package irvine.oeis.a016;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A016786 a(n) = (3*n+1)^10.
 * @author Sean A. Irvine
 */
public class A016786 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016786() {
    super(new long[] {1, -11, 55, -165, 330, -462, 462, -330, 165, -55, 11}, new long[] {1, 1048576, 282475249, 10000000000L, 137858491849L, 1099511627776L, 6131066257801L, 26559922791424L, 95367431640625L, 296196766695424L, 819628286980801L});
  }
}
