package irvine.oeis.a273;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A273180 Numbers k such that ror(k) + rol(k) is a power of 2, where ror(k)=A038572(k) is k rotated one binary place to the right, rol(k)=A006257(k) is k rotated one binary place to the left.
 * @author Sean A. Irvine
 */
public class A273180 extends LinearRecurrence {

  /** Construct the sequence. */
  public A273180() {
    super(1, new long[] {-16, 0, 0, 17, 0, 0}, new long[] {1, 2, 6, 19, 38, 102});
  }
}
