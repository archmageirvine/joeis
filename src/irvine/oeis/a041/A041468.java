package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041468 Numerators of continued fraction convergents to <code>sqrt(250)</code>.
 * @author Sean A. Irvine
 */
public class A041468 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041468() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 8886, 0, 0, 0, 0, 0, 0}, new long[] {15, 16, 79, 253, 838, 3605, 4443, 136895, 141338, 702247, 2248079, 7446484, 32034015, 39480499});
  }
}
