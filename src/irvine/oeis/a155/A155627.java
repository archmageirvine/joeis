package irvine.oeis.a155;

import irvine.oeis.LinearRecurrence;

/**
 * A155627.
 * @author Sean A. Irvine
 */
public class A155627 extends LinearRecurrence {

  /** Construct the sequence. */
  public A155627() {
    super(new long[] {24, -34, 11}, new long[] {1, 3, 21});
  }
}
