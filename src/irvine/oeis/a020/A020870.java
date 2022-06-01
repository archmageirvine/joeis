package irvine.oeis.a020;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A020870 Number of strong single-component edge-subgraphs in Moebius ladder M_n.
 * @author Sean A. Irvine
 */
public class A020870 extends LinearRecurrence {

  /** Construct the sequence. */
  public A020870() {
    super(new long[] {-4, 28, -73, 88, -50, 12}, new long[] {38, 205, 1092, 5719, 29486, 150049});
  }
}
