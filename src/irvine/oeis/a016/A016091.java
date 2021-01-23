package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016091 Expansion of 1/((1-8x)(1-9x)(1-10x)(1-12x)).
 * @author Sean A. Irvine
 */
public class A016091 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016091() {
    super(new long[] {-8640, 3624, -566, 39}, new long[] {1, 39, 955, 18795});
  }
}
