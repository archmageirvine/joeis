package irvine.oeis.a167;

import irvine.oeis.LinearRecurrence;

/**
 * A167547 The fourth row of the <code>ED1</code> array <code>A167546</code>.
 * @author Sean A. Irvine
 */
public class A167547 extends LinearRecurrence {

  /** Construct the sequence. */
  public A167547() {
    super(new long[] {-1, 4, -6, 4}, new long[] {6, 48, 160, 384});
  }
}
