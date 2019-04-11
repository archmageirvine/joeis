package irvine.oeis.a130;

import irvine.oeis.LinearRecurrence;

/**
 * A130656 Interlacing <code>n^3/2</code> and <code>n^2(n + 1)/2</code>.
 * @author Sean A. Irvine
 */
public class A130656 extends LinearRecurrence {

  /** Construct the sequence. */
  public A130656() {
    super(new long[] {-1, 1, 3, -3, -3, 3, 1}, new long[] {1, 4, 18, 32, 75, 108, 196});
  }
}
