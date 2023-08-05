package irvine.oeis.a064;

import irvine.oeis.DifferenceSequence;
import irvine.oeis.a034.A034448;

/**
 * A064992 a(n) = usigma(n+1) - usigma(n), where usigma(n) is the sum of unitary divisors of n (A034448).
 * @author Sean A. Irvine
 */
public class A064992 extends DifferenceSequence {

  /** Construct the sequence. */
  public A064992() {
    super(1, new A034448());
  }
}
