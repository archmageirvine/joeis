package irvine.oeis.a129;

import irvine.oeis.LinearRecurrence;

/**
 * A129362 <code>a(n) =</code> sum{k=floor((n+1)/2)..n, J(k+1)}, J(n) = A001045(n).
 * @author Sean A. Irvine
 */
public class A129362 extends LinearRecurrence {

  /** Construct the sequence. */
  public A129362() {
    super(new long[] {-4, -2, 0, -1, 3, 1}, new long[] {1, 1, 4, 8, 19, 37});
  }
}
