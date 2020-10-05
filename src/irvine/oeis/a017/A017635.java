package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017635 a(n) = (12*n+9)^7.
 * @author Sean A. Irvine
 */
public class A017635 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017635() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {4782969, 1801088541, 42618442977L, 373669453125L, 1954897493193L, 7446353252589L, 22876792454961L, 60170087060757L});
  }
}
