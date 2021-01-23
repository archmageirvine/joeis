package irvine.oeis.a191;

import irvine.oeis.FiniteSequence;

/**
 * A191615 a(1) = 1; a(n) is the smallest number such that a(n)-a(n-1) = A085392 (m), where A085392(m) is the largest noncomposite divisor &lt;m  of m.
 * @author Georg Fischer
 */
public class A191615 extends FiniteSequence {

  /** Construct the sequence. */
  public A191615() {
    super(1, 2, 3, 6, 7, 14, 16, 17, 34, 51, 54);
  }
}
