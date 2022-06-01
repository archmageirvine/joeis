package irvine.oeis.a016;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A016794 a(n) = (3*n + 2)^6.
 * @author Sean A. Irvine
 */
public class A016794 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016794() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {64, 15625, 262144, 1771561, 7529536, 24137569, 64000000});
  }
}
