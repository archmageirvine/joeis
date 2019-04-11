package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017416 <code>(11n+2)^4</code>.
 * @author Sean A. Irvine
 */
public class A017416 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017416() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {16, 28561, 331776, 1500625, 4477456});
  }
}
