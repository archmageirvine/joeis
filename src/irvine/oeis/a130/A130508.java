package irvine.oeis.a130;

import irvine.oeis.LinearRecurrence;

/**
 * A130508 <code>a(1)=2. a(2)=3. a(3)=1. a(n+3) = 3 + a(n)</code>, for all positive integers n.
 * @author Sean A. Irvine
 */
public class A130508 extends LinearRecurrence {

  /** Construct the sequence. */
  public A130508() {
    super(new long[] {-1, 1, 0, 1}, new long[] {2, 3, 1, 5});
  }
}
