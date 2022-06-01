package irvine.oeis.a021;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A021229 Expansion of 1/((1-x)(1-2x)(1-7x)(1-9x)).
 * @author Sean A. Irvine
 */
public class A021229 extends LinearRecurrence {

  /** Construct the sequence. */
  public A021229() {
    super(new long[] {-126, 221, -113, 19}, new long[] {1, 19, 248, 2786});
  }
}
