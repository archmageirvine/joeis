package irvine.oeis.a198;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A198517 Period 5: repeat [1,0,1,0,0].
 * @author Sean A. Irvine
 */
public class A198517 extends LinearRecurrence {

  /** Construct the sequence. */
  public A198517() {
    super(new long[] {1, 0, 0, 0, 0}, new long[] {1, 0, 1, 0, 0});
  }
}
