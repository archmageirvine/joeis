package irvine.oeis.a016;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A016326 Expansion of 1/((1-2x)(1-10x)(1-12x)).
 * @author Sean A. Irvine
 */
public class A016326 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016326() {
    super(new long[] {240, -164, 24}, new long[] {1, 24, 412});
  }
}
