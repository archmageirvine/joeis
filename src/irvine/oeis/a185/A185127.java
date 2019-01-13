package irvine.oeis.a185;

import irvine.oeis.LinearRecurrence;

/**
 * A185127.
 * @author Sean A. Irvine
 */
public class A185127 extends LinearRecurrence {

  /** Construct the sequence. */
  public A185127() {
    super(new long[] {-10, 11}, new long[] {11, 131});
  }
}
