package irvine.oeis.a147;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A147529 Numbers n such that there exists x in N : (x+1)^3 - x^3 = 103*n^2.
 * @author Sean A. Irvine
 */
public class A147529 extends LinearRecurrence {

  /** Construct the sequence. */
  public A147529() {
    super(new long[] {-1, 128405450990L}, new long[] {8827, 1133434915879903L});
  }
}
