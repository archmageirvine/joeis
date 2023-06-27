package irvine.oeis.a291;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A291891 Number of symmetrically unique Dyck paths of semilength n and height seven.
 * @author Sean A. Irvine
 */
public class A291891 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291891() {
    super(7, new long[] {-8, 76, -16, -662, 1046, 480, -2090, 1173, 569, -807, 203, 84, -60, 13}, new long[] {1, 7, 55, 319, 1705, 8238, 37674, 164229, 692627, 2843282, 11433826, 45212792, 176385132, 680452948});
  }
}
