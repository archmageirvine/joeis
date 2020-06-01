package irvine.oeis.a065;

import irvine.oeis.LinearRecurrence;

/**
 * A065186 <code>a(1)=1, a(2)=3, a(3)=5, a(4)=2, a(5)=4;</code> for <code>n &gt; 5, a(n) = a(n-5) + 5</code>.
 * @author Sean A. Irvine
 */
public class A065186 extends LinearRecurrence {

  /** Construct the sequence. */
  public A065186() {
    super(new long[] {-1, 1, 0, 0, 0, 1}, new long[] {1, 3, 5, 2, 4, 6});
  }
}
