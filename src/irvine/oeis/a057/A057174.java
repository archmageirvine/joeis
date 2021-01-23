package irvine.oeis.a057;

import irvine.oeis.LinearRecurrence;

/**
 * A057174 a(n+3)=a(n)+a(n+1)-a(n+2), starting with 1,2,3.
 * @author Sean A. Irvine
 */
public class A057174 extends LinearRecurrence {

  /** Construct the sequence. */
  public A057174() {
    super(new long[] {1, 1, -1}, new long[] {1, 2, 3});
  }
}
