package irvine.oeis.a016;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A016313 Expansion of 1/((1-2x)(1-7x)(1-10x)).
 * @author Sean A. Irvine
 */
public class A016313 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016313() {
    super(new long[] {140, -104, 19}, new long[] {1, 19, 257});
  }
}
