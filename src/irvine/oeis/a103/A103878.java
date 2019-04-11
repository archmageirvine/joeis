package irvine.oeis.a103;

import irvine.oeis.LinearRecurrence;

/**
 * A103878 Expansion of <code>x / ((1-12x)(1-15x)(1-20x)(1-30x)(1-60x))</code>.
 * @author Sean A. Irvine
 */
public class A103878 extends LinearRecurrence {

  /** Construct the sequence. */
  public A103878() {
    super(new long[] {6480000, -1620000, 153000, -6750, 137}, new long[] {0, 1, 137, 12019, 874853});
  }
}
