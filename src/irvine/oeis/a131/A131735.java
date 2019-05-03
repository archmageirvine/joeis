package irvine.oeis.a131;

import irvine.oeis.LinearRecurrence;

/**
 * A131735 Hexaperiodic <code>0, 0, 1, 1, 1, 1</code>.
 * @author Sean A. Irvine
 */
public class A131735 extends LinearRecurrence {

  /** Construct the sequence. */
  public A131735() {
    super(new long[] {1, -1, 1, -1, 1}, new long[] {0, 0, 1, 1, 1});
  }
}
