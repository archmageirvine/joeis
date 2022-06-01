package irvine.oeis.a027;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A027979 a(n) = Sum_{k=0..n} T(n,k)*T(n,2n-k), T given by A027960.
 * @author Sean A. Irvine
 */
public class A027979 extends LinearRecurrence {

  /** Construct the sequence. */
  public A027979() {
    super(new long[] {-1, 5, -5, -5, 5}, new long[] {1, 10, 29, 97, 297});
  }
}
