package irvine.oeis.a094;
// Generated by gen_seq4.pl transpose at 2023-06-02 09:39

import irvine.oeis.triangle.Transpose;

/**
 * A094435 Triangular array read by rows: T(n,k) = Fibonacci(k)*C(n,k), k = 1...n; n&gt;=1.
 * @author Georg Fischer
 */
public class A094435 extends Transpose {

  /** Construct the sequence. */
  public A094435() {
    super(1, new A094440());
  }
}
