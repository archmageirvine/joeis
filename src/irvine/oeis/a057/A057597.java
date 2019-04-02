package irvine.oeis.a057;

import irvine.oeis.LinearRecurrence;

/**
 * A057597 a(n)=-a(n-1)-a(n-2)+a(n-3), a(0)=0,a(1)=0,a(2)=1.
 * @author Sean A. Irvine
 */
public class A057597 extends LinearRecurrence {

  /** Construct the sequence. */
  public A057597() {
    super(new long[] {1, -1, -1}, new long[] {0, 0, 1});
  }
}
