package irvine.oeis.a145;

import irvine.oeis.LinearRecurrence;

/**
 * A145028 Tetranacci numbers: <code>a(n)=a(n-1)+a(n-2)+a(n-3)+a(n-4), {1,2,3,4</code>...}.
 * @author Sean A. Irvine
 */
public class A145028 extends LinearRecurrence {

  /** Construct the sequence. */
  public A145028() {
    super(new long[] {1, 1, 1, 1}, new long[] {1, 2, 3, 4});
  }
}
