package irvine.oeis.a132;

import irvine.oeis.LinearRecurrence;

/**
 * A132753.
 * @author Sean A. Irvine
 */
public class A132753 extends LinearRecurrence {

  /** Construct the sequence. */
  public A132753() {
    super(new long[] {2, -5, 4}, new long[] {3, 4, 7});
  }
}
