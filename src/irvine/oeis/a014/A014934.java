package irvine.oeis.a014;

import irvine.oeis.LinearRecurrence;

/**
 * A014934.
 * @author Sean A. Irvine
 */
public class A014934 extends LinearRecurrence {

  /** Construct the sequence. */
  public A014934() {
    super(new long[] {289, -323, 35}, new long[] {1, 35, 902});
  }
}
