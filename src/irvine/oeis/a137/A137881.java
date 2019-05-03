package irvine.oeis.a137;

import irvine.oeis.LinearRecurrence;

/**
 * A137881 <code>Sqrt[ A137880(n) ]</code>.
 * @author Sean A. Irvine
 */
public class A137881 extends LinearRecurrence {

  /** Construct the sequence. */
  public A137881() {
    super(new long[] {-1, 0, 22, 0}, new long[] {1, 7, 15, 153});
  }
}
