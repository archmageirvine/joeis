package irvine.oeis.a130;

import irvine.oeis.LinearRecurrence;

/**
 * A130505 <code>a(n) = 3*a(n-1)</code> if n is odd, otherwise <code>6*a(n-1)</code>.
 * @author Sean A. Irvine
 */
public class A130505 extends LinearRecurrence {

  /** Construct the sequence. */
  public A130505() {
    super(new long[] {18, 0}, new long[] {1, 3});
  }
}
