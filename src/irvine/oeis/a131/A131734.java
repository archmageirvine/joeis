package irvine.oeis.a131;

import irvine.oeis.LinearRecurrence;

/**
 * A131734 Hexaperiodic <code>[0, 1, 0, 1, 0, -1]</code>.
 * @author Sean A. Irvine
 */
public class A131734 extends LinearRecurrence {

  /** Construct the sequence. */
  public A131734() {
    super(new long[] {1, 0, 0, 0, 0, 0}, new long[] {0, 1, 0, 1, 0, -1});
  }
}
