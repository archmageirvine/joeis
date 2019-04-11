package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016809 <code>(4n)^9</code>.
 * @author Sean A. Irvine
 */
public class A016809 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016809() {
    super(new long[] {-1, 10, -45, 120, -210, 252, -210, 120, -45, 10}, new long[] {0, 262144, 134217728, 5159780352L, 68719476736L, 512000000000L, 2641807540224L, 10578455953408L, 35184372088832L, 101559956668416L});
  }
}
