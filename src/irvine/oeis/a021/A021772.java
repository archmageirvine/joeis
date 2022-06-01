package irvine.oeis.a021;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A021772 Expansion of 1/((1-x)(1-4x)(1-5x)(1-9x)).
 * @author Sean A. Irvine
 */
public class A021772 extends LinearRecurrence {

  /** Construct the sequence. */
  public A021772() {
    super(new long[] {-180, 281, -119, 19}, new long[] {1, 19, 242, 2618});
  }
}
