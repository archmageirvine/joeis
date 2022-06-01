package irvine.oeis.a017;

import irvine.math.z.Z;
import irvine.oeis.recur.LinearRecurrence;

/**
 * A017182 (9n+1)^10.
 * @author Sean A. Irvine
 */
public class A017182 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017182() {
    super(new long[] {1, -11, 55, -165, 330, -462, 462, -330, 165, -55, 11},
      new Z[] {Z.ONE, Z.valueOf(10000000000L), Z.valueOf(6131066257801L), Z.valueOf(296196766695424L), Z.valueOf(4808584372417849L), Z.valueOf(42420747482776576L), Z.valueOf(253295162119140625L), Z.valueOf(1152921504606846976L), Z.valueOf(4297625829703557649L), new Z("13744803133596058624"), new Z("38941611811810745401")});
  }
}
