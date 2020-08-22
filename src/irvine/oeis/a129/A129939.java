package irvine.oeis.a129;

import irvine.oeis.LinearRecurrence;

/**
 * A129939 "Self-Lucas"; a(n) is the sum of the last 5 terms. Sequence starts with 12,21,3,1,19 which are l,u,c,a,s if you consider a=1, b=2, c=3, ..., z=26.
 * @author Sean A. Irvine
 */
public class A129939 extends LinearRecurrence {

  /** Construct the sequence. */
  public A129939() {
    super(new long[] {1, 1, 1, 1, 1}, new long[] {12, 21, 3, 1, 19});
  }
}
