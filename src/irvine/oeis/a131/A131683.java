package irvine.oeis.a131;

import irvine.oeis.LinearRecurrence;

/**
 * A131683 <code>a(n) = 4*(n^1 + 1!)*(n^2 + 2!)*(n^3 + 3!)*(n^4 + 4!)/4!</code>.
 * @author Sean A. Irvine
 */
public class A131683 extends LinearRecurrence {

  /** Construct the sequence. */
  public A131683() {
    super(new long[] {1, -11, 55, -165, 330, -462, 462, -330, 165, -55, 11}, new long[] {48, 175, 1680, 25410, 294000, 2295513, 12991440, 57550100, 211281840, 669529875, 1885734928});
  }
}
