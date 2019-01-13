package irvine.oeis.a253;

import irvine.oeis.LinearRecurrence;

/**
 * A253195.
 * @author Sean A. Irvine
 */
public class A253195 extends LinearRecurrence {

  /** Construct the sequence. */
  public A253195() {
    super(new long[] {-1, 1, 1}, new long[] {5, 8, 14});
  }
}
