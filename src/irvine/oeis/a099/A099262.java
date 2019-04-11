package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099262 <code>a(n) </code>:= <code>(1/5040) 7^n + (1/240) 5^n + (1/72) 4^n + (1/16) 3^n + (11/60) 2^n + 53/144</code>. Partial sum of Stirling numbers of second kind S(n,i), i=1..7 (i.e. <code>a(n) =</code> sum_{i=1..7}S(n,i)).
 * @author Sean A. Irvine
 */
public class A099262 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099262() {
    super(new long[] {-840, 2038, -1849, 820, -190, 22}, new long[] {1, 2, 5, 15, 52, 203});
  }
}
