package irvine.oeis.a237;

import irvine.oeis.LinearRecurrence;

/**
 * A237415 For k in {2,3,...,9} define a sequence as follows: a(0)=0; for n&gt;=0, a(n+1)=a(n)+1, unless a(n) ends in k, in which case a(n+1) is obtained by replacing the last digit of a(n) with the digit(s) of k^3. This is k(2).
 * @author Sean A. Irvine
 */
public class A237415 extends LinearRecurrence {

  /** Construct the sequence. */
  public A237415() {
    super(new long[] {-1, 1, 0, 0, 0, 1}, new long[] {0, 1, 2, 8, 9, 10});
  }
}
