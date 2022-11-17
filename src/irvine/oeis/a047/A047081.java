package irvine.oeis.a047;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A047081 a(n) = Sum_{k=0..n} T(n, k), array T as in A047080.
 * @author Georg Fischer
 */
public class A047081 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047081() {
    super(new long[] {1, 1, 1}, new long[] {1, 2, 3});
  }
}
