package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017248.
 * @author Sean A. Irvine
 */
public class A017248 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017248() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {2401, 65536, 390625, 1336336, 3418801});
  }
}
