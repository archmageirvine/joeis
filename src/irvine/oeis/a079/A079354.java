package irvine.oeis.a079;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A079354 a(1)=1; a(n)=a(n-1)-1 if n is already in the sequence, a(n)=a(n-1)+3 otherwise.
 * @author Sean A. Irvine
 */
public class A079354 extends LinearRecurrence {

  /** Construct the sequence. */
  public A079354() {
    super(1, new long[] {-1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1}, new long[] {1, 4, 7, 6, 9, 8, 7, 6, 5, 8, 11});
  }
}
