package irvine.oeis.a129;

import irvine.oeis.FiniteSequence;

/**
 * A129450 <code>a(n) =</code> smallest perfect power that begins and ends with digit <code>n, 1 &lt;= n &lt;= 9</code>; one-digit numbers are excluded.
 * @author Georg Fischer
 */
public class A129450 extends FiniteSequence {

  /** Construct the sequence. */
  public A129450() {
    super(121, 21952, 343, 484, 5625, 676, 79507, 8242408, 9409);
  }
}
