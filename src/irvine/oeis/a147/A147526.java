package irvine.oeis.a147;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A147526 Numbers Y such that 309*Y^2 + 103 is a square.
 * @author Sean A. Irvine
 */
public class A147526 extends LinearRecurrence {

  /** Construct the sequence. */
  public A147526() {
    super(1, new long[] {-1, 128405450990L}, new long[] {103443, 13282645066862013L});
  }
}
