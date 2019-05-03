package irvine.oeis.a124;

import irvine.oeis.LinearRecurrence;

/**
 * A124437 Experience Points thresholds for levels in the <code>P&amp;P-RPG</code> "Das Schwarze Auge" <code>(DSA</code>, aka "The Dark <code>Eye")</code>.
 * @author Sean A. Irvine
 */
public class A124437 extends LinearRecurrence {

  /** Construct the sequence. */
  public A124437() {
    super(new long[] {1, -3, 3}, new long[] {0, 100, 300});
  }
}
