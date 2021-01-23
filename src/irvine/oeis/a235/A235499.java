package irvine.oeis.a235;

import irvine.oeis.LinearRecurrence;

/**
 * A235499 For k in {2,3,...,9} define a sequence as follows: a(0)=0; for n&gt;=0, a(n+1)=a(n)+1, unless a(n) ends in k, in which case a(n+1) is obtained by replacing the last digit of a(n) with the digit(s) of k^2. This is k(3).
 * @author Sean A. Irvine
 */
public class A235499 extends LinearRecurrence {

  /** Construct the sequence. */
  public A235499() {
    super(new long[] {-1, 1, 0, 0, 0, 1}, new long[] {0, 1, 2, 3, 9, 10});
  }
}
