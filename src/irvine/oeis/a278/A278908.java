package irvine.oeis.a278;
// Generated by gen_seq4.pl multman/mult at 2023-10-02 19:24

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.MultiplicativeSequence;

/**
 * A278908 Multiplicative with a(p^e) = 2^omega(e), where omega = A001221.
 * Multiplicative with: a(p^e) = 2^omega(e), where omega = A001221.
 * @author Georg Fischer
 */
public class A278908 extends MultiplicativeSequence {

  /** Construct the sequence. */
  public A278908() {
    super(1, (p, e) -> Z.TWO.pow(Functions.OMEGA.i(e)));
  }
}
