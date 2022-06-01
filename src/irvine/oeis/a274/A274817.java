package irvine.oeis.a274;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A274817 a(n) = 2*a(n-1) - a(n-3) + 2*a(n-4) for n&gt;3, a(0)=1, a(1)=-1, a(2)=4, a(3)=8.
 * @author Sean A. Irvine
 */
public class A274817 extends LinearRecurrence {

  /** Construct the sequence. */
  public A274817() {
    super(new long[] {2, -1, 0, 2}, new long[] {1, -1, 4, 8});
  }
}
