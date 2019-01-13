package irvine.oeis.a253;

import irvine.oeis.LinearRecurrence;

/**
 * A253945.
 * @author Sean A. Irvine
 */
public class A253945 extends LinearRecurrence {

  /** Construct the sequence. */
  public A253945() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {6, 36, 126, 336, 756, 1512});
  }
}
