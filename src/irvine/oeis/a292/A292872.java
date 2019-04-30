package irvine.oeis.a292;

import irvine.oeis.FiniteSequence;

/**
 * A292872 Perfect n-th powers <code>y^n (n &gt;= 3)</code> of the form <code>x^2 + 2^a * 11^b (x &gt;= 1, a, b &gt;= 0, gcd(x, y) = 1)</code>.
 * @author Georg Fischer
 */
public class A292872 extends FiniteSequence {

  /** Construct the sequence. */
  public A292872() {
    super(27, 81, 125, 243, 729, 3375, 15625, 59049, 704969, 33698267, 41063625, 86938307, 100544625L, 483736625L, 163218919625L);
  }
}
