package irvine.oeis.a123;

import irvine.oeis.LinearRecurrence;

/**
 * A123658.
 * @author Sean A. Irvine
 */
public class A123658 extends LinearRecurrence {

  /** Construct the sequence. */
  public A123658() {
    super(new long[] {1, -11, 55, -165, 330, -462, 462, -330, 165, -55, 11}, new long[] {5, 1617, 79543, 1315073, 11735001, 70591825, 322948907, 1208225793, 3874742893L, 11001010001L, 28297158495L});
  }
}
