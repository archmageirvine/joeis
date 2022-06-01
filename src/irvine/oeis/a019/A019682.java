package irvine.oeis.a019;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A019682 Expansion of 1/((1-4x)(1-9x)(1-10x)).
 * @author Sean A. Irvine
 */
public class A019682 extends LinearRecurrence {

  /** Construct the sequence. */
  public A019682() {
    super(new long[] {360, -166, 23}, new long[] {1, 23, 363});
  }
}
