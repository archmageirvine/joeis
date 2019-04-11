package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016295 Expansion of <code>1/((1-2x)(1-5x)(1-6x))</code>.
 * @author Sean A. Irvine
 */
public class A016295 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016295() {
    super(new long[] {60, -52, 13}, new long[] {1, 13, 117});
  }
}
