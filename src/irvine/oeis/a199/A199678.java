package irvine.oeis.a199;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A199678 10*9^n+1.
 * @author Sean A. Irvine
 */
public class A199678 extends LinearRecurrence {

  /** Construct the sequence. */
  public A199678() {
    super(new long[] {-9, 10}, new long[] {11, 91});
  }
}
