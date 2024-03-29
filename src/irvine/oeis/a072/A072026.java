package irvine.oeis.a072;
// Generated by gen_seq4.pl mult at 2022-08-01 11:56

import irvine.math.z.Z;
import irvine.oeis.MultiplicativeSequence;

/**
 * A072026 Swap twin prime pairs &gt;(3,5) in prime factorization of n.
 * @author Georg Fischer
 */
public class A072026 extends MultiplicativeSequence {

  /** Construct the sequence. */
  public A072026() {
    super(1, (p, e) -> (p.compareTo(Z.THREE) <= 0 ? p : (p.add(2).isPrime() ? p.add(2) : (p.subtract(2).isPrime() ? p.subtract(2) : p))).pow(e));
  }
}
