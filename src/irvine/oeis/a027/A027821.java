package irvine.oeis.a027;

import irvine.oeis.LinearRecurrence;

/**
 * A027821.
 * @author Sean A. Irvine
 */
public class A027821 extends LinearRecurrence {

  /** Construct the sequence. */
  public A027821() {
    super(new long[] {1, -11, 55, -165, 330, -462, 462, -330, 165, -55, 11}, new long[] {84, 1050, 6930, 32340, 120120, 378378, 1051050, 2642640, 6126120, 13273260, 27159132});
  }
}
