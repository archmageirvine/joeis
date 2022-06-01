package irvine.oeis.a256;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A256181 The number of permutations of length n sortable by 3 block interchanges.
 * @author Sean A. Irvine
 */
public class A256181 extends LinearRecurrence {

  /** Construct the sequence. */
  public A256181() {
    super(new long[] {1, -13, 78, -286, 715, -1287, 1716, -1716, 1287, -715, 286, -78, 13}, new long[] {1, 2, 6, 24, 120, 720, 5040, 32256, 169632, 737364, 2731444, 8875868, 25894376});
  }
}
