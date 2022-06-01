package irvine.oeis.a016;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A016966 a(n) = (6*n + 4)^10.
 * @author Sean A. Irvine
 */
public class A016966 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016966() {
    super(new long[] {1, -11, 55, -165, 330, -462, 462, -330, 165, -55, 11}, new long[] {1048576, 10000000000L, 1099511627776L, 26559922791424L, 296196766695424L, 2064377754059776L, 10485760000000000L, 42420747482776576L, 144555105949057024L, 430804206899405824L, 1152921504606846976L});
  }
}
