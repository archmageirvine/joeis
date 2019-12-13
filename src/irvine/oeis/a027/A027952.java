package irvine.oeis.a027;

import irvine.oeis.LinearRecurrence;

/**
 * A027952 <code>a(n) = T(2n,n+4)</code>, T given by <code>A027948</code>.
 * @author Sean A. Irvine
 */
public class A027952 extends LinearRecurrence {

  /** Construct the sequence. */
  public A027952() {
    super(new long[] {1, -12, 64, -201, 414, -588, 588, -414, 201, -64, 12},
      new long[] {10, 231, 2300, 14820, 72905, 298925, 1077748, 3540913, 10871723, 31775031, 89633545}, 1);
  }
}
