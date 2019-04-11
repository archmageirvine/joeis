package irvine.oeis.a129;

import irvine.oeis.LinearRecurrence;

/**
 * A129938 "Self-Fibonacci"; <code>a(n)</code> is the sum of the last nine terms. Sequence starts with <code>6,9,2,15,14,1,3,3,9</code> which are f,i,b,o,n,a,c,c,i if you consider <code>a=1,</code> b=2, c=3, ..., z=26.
 * @author Sean A. Irvine
 */
public class A129938 extends LinearRecurrence {

  /** Construct the sequence. */
  public A129938() {
    super(new long[] {1, 1, 1, 1, 1, 1, 1, 1, 1}, new long[] {6, 9, 2, 15, 14, 1, 3, 3, 9});
  }
}
