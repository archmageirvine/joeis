package irvine.oeis.a180;

import irvine.oeis.LinearRecurrence;

/**
 * A180250 <code>a(n) = 5*a(n-1) + 10*a(n-2),</code> with <code>a(1)=0</code> and <code>a(2)=1</code>.
 * @author Sean A. Irvine
 */
public class A180250 extends LinearRecurrence {

  /** Construct the sequence. */
  public A180250() {
    super(new long[] {10, 5}, new long[] {0, 1});
  }
}
