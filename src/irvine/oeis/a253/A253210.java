package irvine.oeis.a253;

import irvine.oeis.LinearRecurrence;

/**
 * A253210.
 * @author Sean A. Irvine
 */
public class A253210 extends LinearRecurrence {

  /** Construct the sequence. */
  public A253210() {
    super(new long[] {-7, 8}, new long[] {7, 13});
  }
}
