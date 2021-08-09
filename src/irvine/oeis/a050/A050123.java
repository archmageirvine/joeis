package irvine.oeis.a050;

import irvine.oeis.DifferenceSequence;

/**
 * A050123 a(n) = b(n)-b(n-1), where b=A050122 (ordered products of Fibonacci and Lucas numbers).
 * @author Sean A. Irvine
 */
public class A050123 extends DifferenceSequence {

  /** Construct the sequence. */
  public A050123() {
    super(new A050122());
  }
}
