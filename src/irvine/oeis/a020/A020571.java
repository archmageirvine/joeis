package irvine.oeis.a020;

import irvine.oeis.LinearRecurrence;

/**
 * A020571 Expansion of <code>1/((1-6x)(1-7x)(1-9x))</code>.
 * @author Sean A. Irvine
 */
public class A020571 extends LinearRecurrence {

  /** Construct the sequence. */
  public A020571() {
    super(new long[] {378, -159, 22}, new long[] {1, 22, 325});
  }
}
