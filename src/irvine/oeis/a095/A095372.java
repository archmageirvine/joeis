package irvine.oeis.a095;

import irvine.oeis.LinearRecurrence;

/**
 * A095372 <code>1+integers</code> repeating <code>"90"</code> decimal digit pattern:.
 * @author Sean A. Irvine
 */
public class A095372 extends LinearRecurrence {

  /** Construct the sequence. */
  public A095372() {
    super(new long[] {-100, 101}, new long[] {1, 91});
  }
}
