package irvine.oeis.a126;

import irvine.oeis.LinearRecurrence;

/**
 * A126116 <code>a(n) = a(n-1) + a(n-3) + a(n-4)</code>, with <code>a(0)=a(1)=a(2)=a(3)=1</code>.
 * @author Sean A. Irvine
 */
public class A126116 extends LinearRecurrence {

  /** Construct the sequence. */
  public A126116() {
    super(new long[] {1, 1, 0, 1}, new long[] {1, 1, 1, 1});
  }
}
