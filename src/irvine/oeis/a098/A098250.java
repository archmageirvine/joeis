package irvine.oeis.a098;

import irvine.oeis.LinearRecurrence;

/**
 * A098250.
 * @author Sean A. Irvine
 */
public class A098250 extends LinearRecurrence {

  /** Construct the sequence. */
  public A098250() {
    super(new long[] {-1, 291}, new long[] {1, 290});
  }
}
