package irvine.oeis.a049;

import irvine.oeis.DifferenceSequence;

/**
 * A049874 a(n)=b(n)-b(n-1), where b=A049862 (differences of products of Fibonacci numbers.).
 * @author Sean A. Irvine
 */
public class A049874 extends DifferenceSequence {

  /** Construct the sequence. */
  public A049874() {
    super(1, new A049862());
  }
}
