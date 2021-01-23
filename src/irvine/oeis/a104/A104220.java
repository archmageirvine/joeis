package irvine.oeis.a104;

import irvine.oeis.LinearRecurrence;

/**
 * A104220 a(n) = Fibonacci[n]+1-Mod[Fibonacci[n],2].
 * @author Sean A. Irvine
 */
public class A104220 extends LinearRecurrence {

  /** Construct the sequence. */
  public A104220() {
    super(new long[] {-1, -1, 1, 1, 1}, new long[] {1, 1, 1, 3, 3});
  }
}
