package irvine.oeis.a021;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A021079 Expansion of 1/((1-x)(1-2x)(1-4x)(1-7x)).
 * @author Sean A. Irvine
 */
public class A021079 extends LinearRecurrence {

  /** Construct the sequence. */
  public A021079() {
    super(new long[] {-56, 106, -63, 14}, new long[] {1, 14, 133, 1086});
  }
}
