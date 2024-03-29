package irvine.oeis.a123;
// Generated by gen_seq4.pl mult at 2022-07-21 21:19

import irvine.math.z.Z;
import irvine.oeis.MultiplicativeSequence;

/**
 * A123565 a(n) is the number of positive integers k which are &lt;= n and where k, k-1 and k+1 are each coprime to n.
 * @author Georg Fischer
 */
public class A123565 extends MultiplicativeSequence {

  /** Construct the sequence. */
  public A123565() {
    super(1, (p, e) -> p.equals(Z.TWO) ? Z.ZERO : p.subtract(3).multiply(p.pow(e - 1)));
  }
}
