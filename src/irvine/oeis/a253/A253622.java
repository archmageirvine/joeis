package irvine.oeis.a253;

import irvine.oeis.LinearRecurrence;

/**
 * A253622.
 * @author Sean A. Irvine
 */
public class A253622 extends LinearRecurrence {

  /** Construct the sequence. */
  public A253622() {
    super(new long[] {1, -143, 143}, new long[] {1, 106, 15016});
  }
}
