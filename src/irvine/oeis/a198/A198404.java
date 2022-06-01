package irvine.oeis.a198;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A198404 8^n*n^8.
 * @author Sean A. Irvine
 */
public class A198404 extends LinearRecurrence {

  /** Construct the sequence. */
  public A198404() {
    super(new long[] {134217728, -150994944, 75497472, -22020096, 4128768, -516096, 43008, -2304, 72}, new long[] {0, 8, 16384, 3359232, 268435456, 12800000000L, 440301256704L, 12089663946752L, 281474976710656L});
  }
}
