package irvine.oeis.a288;

import irvine.oeis.LinearRecurrence;

/**
 * A288477 <code>a(n) = (2^49 - 2)*n/3 + 247371098957</code>.
 * @author Sean A. Irvine
 */
public class A288477 extends LinearRecurrence {

  /** Construct the sequence. */
  public A288477() {
    super(new long[] {-1, 2}, new long[] {247371098957L, 187897355572727L});
  }
}
