package irvine.oeis.a128;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A128967 (n^3-n)*8^n.
 * @author Sean A. Irvine
 */
public class A128967 extends LinearRecurrence {

  /** Construct the sequence. */
  public A128967() {
    super(new long[] {-4096, 2048, -384, 32}, new long[] {0, 384, 12288, 245760});
  }
}
