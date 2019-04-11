package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017999 Expansion of <code>1/((1-3x)(1-7x)(1-10x))</code>.
 * @author Sean A. Irvine
 */
public class A017999 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017999() {
    super(new long[] {210, -121, 20}, new long[] {1, 20, 279});
  }
}
