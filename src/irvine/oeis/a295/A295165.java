package irvine.oeis.a295;
// Generated by gen_seq4.pl 2024-07-13/filnum at 2024-07-13 23:12

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.FilterNumberSequence;
import irvine.oeis.a000.A000166;

/**
 * A295165 Numbers n such that !n and n!! (A000166(n) and A006882(n)) are coprime.
 * @author Georg Fischer
 */
public class A295165 extends FilterNumberSequence {

  private static final DirectSequence A000166 = new A000166();

  /** Construct the sequence. */
  public A295165() {
    super(1, 0, n -> Functions.GCD.z(A000166.a(n), Functions.MULTIFACTORIAL.z(2, n)).equals(Z.ONE));
  }
}
