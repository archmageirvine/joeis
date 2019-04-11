package irvine.oeis.a155;

import irvine.oeis.LinearRecurrence;

/**
 * A155607 <code>9^n+3^n-1</code>.
 * @author Sean A. Irvine
 */
public class A155607 extends LinearRecurrence {

  /** Construct the sequence. */
  public A155607() {
    super(new long[] {27, -39, 13}, new long[] {1, 11, 89});
  }
}
