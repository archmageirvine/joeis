package irvine.oeis.a021;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A021234 Expansion of 1/((1-x)(1-2x)(1-7x)(1-10x)).
 * @author Sean A. Irvine
 */
public class A021234 extends LinearRecurrence {

  /** Construct the sequence. */
  public A021234() {
    super(new long[] {-140, 244, -123, 20}, new long[] {1, 20, 277, 3324});
  }
}
