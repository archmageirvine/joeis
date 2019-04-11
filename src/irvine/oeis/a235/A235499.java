package irvine.oeis.a235;

import irvine.oeis.LinearRecurrence;

/**
 * A235499 For k in <code>{2,3,...,9}</code> define a sequence as follows: <code>a(0)=0</code>; for <code>n&gt;=0, a(n+1)=a(n)+1,</code> unless <code>a(n)</code> ends in <code>k,</code> in which case <code>a(n+1)</code> is obtained by replacing the last digit of <code>a(n)</code> with the digit(s) of <code>k^2.</code> This is <code>k(3)</code>.
 * @author Sean A. Irvine
 */
public class A235499 extends LinearRecurrence {

  /** Construct the sequence. */
  public A235499() {
    super(new long[] {-1, 1, 0, 0, 0, 1}, new long[] {0, 1, 2, 3, 9, 10});
  }
}
