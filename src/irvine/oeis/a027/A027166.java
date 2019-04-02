package irvine.oeis.a027;

import irvine.oeis.LinearRecurrence;

/**
 * A027166 a(n) = Sum{T(i,j)}, 0&lt;=j&lt;=i, 0&lt;=i&lt;=n, T given by A027157.
 * @author Sean A. Irvine
 */
public class A027166 extends LinearRecurrence {

  /** Construct the sequence. */
  public A027166() {
    super(new long[] {3, -6, 9, -12, 5, 2}, new long[] {1, 4, 14, 36, 103, 248});
  }
}
