package irvine.oeis.a016;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A016891 (5n+3)^7.
 * @author Sean A. Irvine
 */
public class A016891 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016891() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {2187, 2097152, 62748517, 612220032, 3404825447L, 13492928512L, 42618442977L, 114415582592L});
  }
}
