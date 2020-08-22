package irvine.oeis.a178;

import irvine.oeis.LinearRecurrence;

/**
 * A178511 a(n) = (1/119)*(100^n -(-19)^n).
 * @author Sean A. Irvine
 */
public class A178511 extends LinearRecurrence {

  /** Construct the sequence. */
  public A178511() {
    super(new long[] {1900, 81}, new long[] {1, 81});
  }
}
