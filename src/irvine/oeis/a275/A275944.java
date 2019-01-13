package irvine.oeis.a275;

import irvine.oeis.LinearRecurrence;

/**
 * A275944.
 * @author Sean A. Irvine
 */
public class A275944 extends LinearRecurrence {

  /** Construct the sequence. */
  public A275944() {
    super(new long[] {-1000000, 1111000, -112110, 1111}, new long[] {1, 1111, 1122211, 1123333211});
  }
}
