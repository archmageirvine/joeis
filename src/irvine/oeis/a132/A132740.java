package irvine.oeis.a132;
// Generated by gen_seq4.pl mult at 2022-07-21 21:19

import irvine.math.z.Z;
import irvine.oeis.MultiplicativeSequence;

/**
 * A132740 Largest divisor of n coprime to 10.
 * @author Georg Fischer
 */
public class A132740 extends MultiplicativeSequence {

  /** Construct the sequence. */
  public A132740() {
    super(1, (p, e) -> p.equals(Z.TWO) ? Z.ONE : (p.equals(Z.FIVE) ? Z.ONE : p.pow(e)));
  }
}
