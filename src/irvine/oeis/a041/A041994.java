package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041994 Numerators of continued fraction convergents to sqrt(520).
 * @author Sean A. Irvine
 */
public class A041994 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041994() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 12998, 0, 0, 0, 0, 0}, new long[] {22, 23, 114, 1277, 5222, 6499, 291178, 297677, 1481886, 16598423, 67875578, 84474001});
  }
}
