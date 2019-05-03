package irvine.oeis.a147;

import irvine.oeis.LinearRecurrence;

/**
 * A147525 Numbers X such that there exists Y in N : <code>X^2=309*Y^2+103</code>.
 * @author Sean A. Irvine
 */
public class A147525 extends LinearRecurrence {

  /** Construct the sequence. */
  public A147525() {
    super(new long[] {-1, 128405450990L}, new long[] {1818362, 233487592671260018L});
  }
}
