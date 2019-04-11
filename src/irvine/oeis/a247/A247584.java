package irvine.oeis.a247;

import irvine.oeis.LinearRecurrence;

/**
 * A247584 <code>a(n) = 5a(n-1)-10a(n-2)+10a(n-3)-5a(n-4)+3a(n-5)</code> with <code>a(0)=a(1)=a(2)=a(3)=a(4)=1</code>.
 * @author Sean A. Irvine
 */
public class A247584 extends LinearRecurrence {

  /** Construct the sequence. */
  public A247584() {
    super(new long[] {3, -5, 10, -10, 5}, new long[] {1, 1, 1, 1, 1});
  }
}
