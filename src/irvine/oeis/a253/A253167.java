package irvine.oeis.a253;

import irvine.oeis.LinearRecurrence;

/**
 * A253167.
 * @author Sean A. Irvine
 */
public class A253167 extends LinearRecurrence {

  /** Construct the sequence. */
  public A253167() {
    super(new long[] {1, -1, -1154, 1154, 1}, new long[] {1, 871, 2841, 1006671, 3280049});
  }
}
