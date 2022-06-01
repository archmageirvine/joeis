package irvine.oeis.a105;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A105252 a(n) = binomial(n+5,n)*binomial(n+9,n).
 * @author Sean A. Irvine
 */
public class A105252 extends LinearRecurrence {

  /** Construct the sequence. */
  public A105252() {
    super(new long[] {1, -15, 105, -455, 1365, -3003, 5005, -6435, 6435, -5005, 3003, -1365, 455, -105, 15}, new long[] {1, 60, 1155, 12320, 90090, 504504, 2312310, 9060480, 31286970, 97337240, 277411134, 733649280, 1818838840, 4261894560L, 9502285320L});
  }
}
