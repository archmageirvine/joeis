package irvine.oeis.a140;

import irvine.oeis.LinearRecurrence;

/**
 * A140345 <code>a(n)=a(n-1)^2-a(n-2)-a(n-3)-a(n-4), a(1)=a(2)=a(3)=a(4)=1</code>.
 * @author Sean A. Irvine
 */
public class A140345 extends LinearRecurrence {

  /** Construct the sequence. */
  public A140345() {
    super(new long[] {1, 0, 0, 0, 0}, new long[] {1, 1, 1, 1, -2});
  }
}
