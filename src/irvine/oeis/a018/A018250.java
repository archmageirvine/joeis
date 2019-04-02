package irvine.oeis.a018;

import irvine.oeis.LinearRecurrence;

/**
 * A018250 Expansion of 1/((1-4x)(1-5x)(1-8x)).
 * @author Sean A. Irvine
 */
public class A018250 extends LinearRecurrence {

  /** Construct the sequence. */
  public A018250() {
    super(new long[] {160, -92, 17}, new long[] {1, 17, 197});
  }
}
