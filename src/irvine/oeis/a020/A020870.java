package irvine.oeis.a020;

import irvine.oeis.LinearRecurrence;

/**
 * A020870 Number of strong <code>single-component edge-subgraphs</code> in Moebius ladder <code>M_n</code>.
 * @author Sean A. Irvine
 */
public class A020870 extends LinearRecurrence {

  /** Construct the sequence. */
  public A020870() {
    super(new long[] {-4, 28, -73, 88, -50, 12}, new long[] {38, 205, 1092, 5719, 29486, 150049});
  }
}
