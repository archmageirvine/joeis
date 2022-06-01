package irvine.oeis.a024;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A024778 Expansion of 1/((1-x)(1-8x)(1-9x)(1-12x)).
 * @author Sean A. Irvine
 */
public class A024778 extends LinearRecurrence {

  /** Construct the sequence. */
  public A024778() {
    super(new long[] {-864, 1140, -305, 30}, new long[] {1, 30, 595, 9840});
  }
}
