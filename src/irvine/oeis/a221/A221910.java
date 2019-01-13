package irvine.oeis.a221;

import irvine.oeis.LinearRecurrence;

/**
 * A221910.
 * @author Sean A. Irvine
 */
public class A221910 extends LinearRecurrence {

  /** Construct the sequence. */
  public A221910() {
    super(new long[] {8, -17, 10}, new long[] {1, 16, 80});
  }
}
