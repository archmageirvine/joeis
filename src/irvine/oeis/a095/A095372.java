package irvine.oeis.a095;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A095372 1+integers repeating "90" decimal digit pattern:.
 * @author Sean A. Irvine
 */
public class A095372 extends LinearRecurrence {

  /** Construct the sequence. */
  public A095372() {
    super(new long[] {-100, 101}, new long[] {1, 91});
  }
}
