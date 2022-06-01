package irvine.oeis.a016;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A016858 (5n)^10.
 * @author Sean A. Irvine
 */
public class A016858 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016858() {
    super(new long[] {1, -11, 55, -165, 330, -462, 462, -330, 165, -55, 11}, new long[] {0, 9765625, 10000000000L, 576650390625L, 10240000000000L, 95367431640625L, 590490000000000L, 2758547353515625L, 10485760000000000L, 34050628916015625L, 97656250000000000L});
  }
}
