package irvine.oeis.a025;

import irvine.oeis.LinearRecurrence;

/**
 * A025948 Expansion of 1/((1-2x)(1-3x)(1-8x)(1-9x)).
 * @author Sean A. Irvine
 */
public class A025948 extends LinearRecurrence {

  /** Construct the sequence. */
  public A025948() {
    super(new long[] {-432, 462, -163, 22}, new long[] {1, 22, 321, 3938});
  }
}
