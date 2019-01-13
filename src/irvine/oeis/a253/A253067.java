package irvine.oeis.a253;

import irvine.oeis.LinearRecurrence;

/**
 * A253067.
 * @author Sean A. Irvine
 */
public class A253067 extends LinearRecurrence {

  /** Construct the sequence. */
  public A253067() {
    super(new long[] {8, 6, 13, 5, 1}, new long[] {1, 5, 17, 65, 229});
  }
}
