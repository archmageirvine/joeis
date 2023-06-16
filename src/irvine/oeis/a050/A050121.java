package irvine.oeis.a050;

import irvine.oeis.DifferenceSequence;

/**
 * A050121 a(n)=b(n)-b(n-1), where b=A050120 (ordered products of Fibonacci and Lucas numbers).
 * @author Sean A. Irvine
 */
public class A050121 extends DifferenceSequence {

  /** Construct the sequence. */
  public A050121() {
    super(2, new A050120());
  }
}
