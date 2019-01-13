package irvine.oeis.a167;

import irvine.oeis.LinearRecurrence;

/**
 * A167825.
 * @author Sean A. Irvine
 */
public class A167825 extends LinearRecurrence {

  /** Construct the sequence. */
  public A167825() {
    super(new long[] {-1, 340}, new long[] {220, 74801});
  }
}
