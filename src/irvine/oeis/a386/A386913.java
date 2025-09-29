package irvine.oeis.a386;

import irvine.oeis.InverseSequence;
import irvine.oeis.a380.A380656;

/**
 * A386913 Smallest k for which the number of divisors d of k such that d == -d^k (mod k) is equal to n, or -1 if no such k exists.
 * @author Sean A. Irvine
 */
public class A386913 extends InverseSequence {

  /** Construct the sequence. */
  public A386913() {
    super(0, new A380656(), 0);
  }
}
