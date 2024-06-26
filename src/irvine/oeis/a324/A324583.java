package irvine.oeis.a324;
// Generated by gen_seq4.pl 2024-06-17/filnum at 2024-06-17 23:19

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.FilterNumberSequence;

/**
 * A324583 Numbers k such that k and A276086(k) are coprime, where A276086 is the primorial base exp-function.
 * @author Georg Fischer
 */
public class A324583 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A324583() {
    super(1, 0, k -> Functions.GCD.z(k, Functions.PRIMORIAL_BASE_EXP.z(k)).equals(Z.ONE));
  }
}
