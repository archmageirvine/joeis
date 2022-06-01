package irvine.oeis.a152;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A152896 a=b=c=0;c(n)=c+n+a;b(n)=b+n+c;a(n)=a+n+b.
 * @author Sean A. Irvine
 */
public class A152896 extends LinearRecurrence {

  /** Construct the sequence. */
  public A152896() {
    super(new long[] {1, -5, 11, -12, 6}, new long[] {0, 3, 15, 55, 183});
  }
}
