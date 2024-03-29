package irvine.oeis.a330;
// Generated by gen_seq4.pl A081373/ordtraf at 2023-10-03 19:26

import irvine.oeis.a017.A017666;
import irvine.oeis.transform.OrdinalTransformSequence;

/**
 * A330746 Number of values of k, 1 &lt;= k &lt;= n, with A017666(k) = A017666(n), where A017666(n) = n/gcd(n, sigma(n)).
 * @author Georg Fischer
 */
public class A330746 extends OrdinalTransformSequence {

  /** Construct the sequence. */
  public A330746() {
    super(1, new A017666());
  }
}

