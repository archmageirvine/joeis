package irvine.oeis.a066;

import irvine.oeis.LinearRecurrence;

/**
 * A066443 Number of distinct paths of length <code>2n+1</code> along edges of a unit cube between two fixed adjacent vertices.
 * @author Sean A. Irvine
 */
public class A066443 extends LinearRecurrence {

  /** Construct the sequence. */
  public A066443() {
    super(new long[] {-9, 10}, new long[] {1, 7});
  }
}
