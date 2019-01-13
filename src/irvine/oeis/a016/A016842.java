package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016842.
 * @author Sean A. Irvine
 */
public class A016842 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016842() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {729, 117649, 1771561, 11390625, 47045881, 148035889, 387420489});
  }
}
