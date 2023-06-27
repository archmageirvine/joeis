package irvine.oeis.a212;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A212594 a(n) is the difference between multiples of 11 with even and odd decimal digit sum in interval [0,10^n).
 * @author Sean A. Irvine
 */
public class A212594 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212594() {
    super(1, new long[] {11, 0, -165, 0, 462, 0, -330, 0, 55, 0}, new long[] {1, 10, 19, 430, 841, 20602, 40363, 995710, 1951057, 48162410});
  }
}
