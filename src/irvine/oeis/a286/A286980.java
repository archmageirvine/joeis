package irvine.oeis.a286;

import irvine.oeis.FiniteSequence;

/**
 * A286980 Binomial coefficients binomial(n,k) = uv such that <code>n&gt;=2k</code> and u &gt; v, where gpf(u) <code>&lt; k,</code> gpf(v) <code>&gt;= k</code> (gpf(n)= is the greatest prime factor of <code>n)</code>.
 * @author Georg Fischer
 */
public class A286980 extends FiniteSequence {

  /** Construct the sequence. */
  public A286980() {
    super(56, 126, 252, 792, 116280, 203490, 2035800, 573166440L, 818809200L, 2310789600L, 8597496600L, 1889912732400L);
  }
}
