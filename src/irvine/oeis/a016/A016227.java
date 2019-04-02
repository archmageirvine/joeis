package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016227 Expansion of 1/((1-x)(1-4x)(1-12x)).
 * @author Sean A. Irvine
 */
public class A016227 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016227() {
    super(new long[] {48, -64, 17}, new long[] {1, 17, 225});
  }
}
