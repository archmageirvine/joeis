package irvine.oeis.a145;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A145029 Pentanacci numbers: a(n)=a(n-1)+a(n-2)+a(n-3)+a(n-4)+a(n-5), {1,2,3,4,5...}.
 * @author Sean A. Irvine
 */
public class A145029 extends LinearRecurrence {

  /** Construct the sequence. */
  public A145029() {
    super(new long[] {1, 1, 1, 1, 1}, new long[] {1, 2, 3, 4, 5});
  }
}
