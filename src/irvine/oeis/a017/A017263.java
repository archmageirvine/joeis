package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017263 <code>a(n) = (9*n + 8)^7</code>.
 * @author Sean A. Irvine
 */
public class A017263 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017263() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {2097152, 410338673, 8031810176L, 64339296875L, 319277809664L, 1174711139837L, 3521614606208L, 9095120158391L});
  }
}
