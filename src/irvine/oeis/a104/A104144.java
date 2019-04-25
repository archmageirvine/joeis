package irvine.oeis.a104;

import irvine.oeis.LinearRecurrence;

/**
 * A104144 <code>a(n) = Sum_{k=1..9} a(n-k)</code>; <code>a(8) = 1, a(n) = 0</code> for <code>n &lt; 8</code>.
 * @author Sean A. Irvine
 */
public class A104144 extends LinearRecurrence {

  /** Construct the sequence. */
  public A104144() {
    super(new long[] {1, 1, 1, 1, 1, 1, 1, 1, 1}, new long[] {0, 0, 0, 0, 0, 0, 0, 0, 1});
  }
}
