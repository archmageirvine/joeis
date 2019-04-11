package irvine.oeis.a079;

import irvine.oeis.LinearRecurrence;

/**
 * A079354 <code>a(1)=1</code>; <code>a(n)=a(n-1)-1</code> if n is already in the sequence, <code>a(n)=a(n-1)+3</code> otherwise.
 * @author Sean A. Irvine
 */
public class A079354 extends LinearRecurrence {

  /** Construct the sequence. */
  public A079354() {
    super(new long[] {-1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1}, new long[] {1, 4, 7, 6, 9, 8, 7, 6, 5, 8, 11});
  }
}
