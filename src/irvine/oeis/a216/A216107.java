package irvine.oeis.a216;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A216107 The hyper-Wiener index of the tetrameric 1,3-adamantane TA(n) (see the Fath-Tabar et al. reference).
 * @author Sean A. Irvine
 */
public class A216107 extends LinearRecurrence {

  /** Construct the sequence. */
  public A216107() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {168, 1720, 6636, 17796, 38980});
  }
}
