package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016939 a(n) = (6n+2)^7.
 * @author Sean A. Irvine
 */
public class A016939 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016939() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {128, 2097152, 105413504, 1280000000, 8031810176L, 34359738368L, 114415582592L, 319277809664L});
  }
}
