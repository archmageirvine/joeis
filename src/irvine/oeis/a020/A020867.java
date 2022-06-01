package irvine.oeis.a020;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A020867 Number of forests with no isolated vertices in Moebius ladder M_n.
 * @author Sean A. Irvine
 */
public class A020867 extends LinearRecurrence {

  /** Construct the sequence. */
  public A020867() {
    super(new long[] {1, -2, -10, 19, 33, -61, -39, 78, 4, -33, 11}, new long[] {19, 132, 851, 5298, 32068, 190711, 1120947, 6537903, 37935984, 219360837, 1265462984});
  }
}
