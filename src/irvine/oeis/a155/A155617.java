package irvine.oeis.a155;

import irvine.oeis.LinearRecurrence;

/**
 * A155617 <code>6^n + 4^n - 1</code>.
 * @author Sean A. Irvine
 */
public class A155617 extends LinearRecurrence {

  /** Construct the sequence. */
  public A155617() {
    super(new long[] {24, -34, 11}, new long[] {1, 9, 51});
  }
}
