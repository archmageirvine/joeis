package irvine.oeis.a005;

import irvine.oeis.LinearRecurrence;

/**
 * A005709.
 * @author Sean A. Irvine
 */
public class A005709 extends LinearRecurrence {

  /** Construct the sequence. */
  public A005709() {
    super(new long[] {1, 0, 0, 0, 0, 0, 1}, new long[] {1, 1, 1, 1, 1, 1, 1});
  }
}

