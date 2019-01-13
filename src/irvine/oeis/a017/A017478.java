package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017478.
 * @author Sean A. Irvine
 */
public class A017478 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017478() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {117649, 34012224, 594823321, 4096000000L, 17596287801L, 56800235584L, 151334226289L});
  }
}
