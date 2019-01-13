package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016785.
 * @author Sean A. Irvine
 */
public class A016785 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016785() {
    super(new long[] {-1, 10, -45, 120, -210, 252, -210, 120, -45, 10}, new long[] {1, 262144, 40353607, 1000000000, 10604499373L, 68719476736L, 322687697779L, 1207269217792L, 3814697265625L, 10578455953408L});
  }
}
