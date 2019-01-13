package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016321.
 * @author Sean A. Irvine
 */
public class A016321 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016321() {
    super(new long[] {180, -128, 21}, new long[] {1, 21, 313});
  }
}
