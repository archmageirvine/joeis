package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016312 Expansion of 1/((1-2x)*(1-7x)*(1-9x)).
 * @author Sean A. Irvine
 */
public class A016312 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016312() {
    super(new long[] {126, -95, 18}, new long[] {1, 18, 229});
  }
}
