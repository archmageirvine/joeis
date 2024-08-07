package irvine.oeis.a324;
// Generated by gen_seq4.pl 2024-07-12/filnum at 2024-07-12 23:14

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.FilterNumberSequence;

/**
 * A324643 Numbers k such that bitand(2k,sigma(k))/2 = k = bitand(k,sigma(k)-k), where bitand is bitwise-AND, A004198.
 * @author Georg Fischer
 */
public class A324643 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A324643() {
    super(1, 1, k -> {
      final Z sk = Functions.SIGMA1.z(k);
      return sk.and(Z.valueOf(2L * k)).divide(2).equals(Z.valueOf(k)) && Z.valueOf(k).equals(sk.subtract(k).and(Z.valueOf(k)));
    });
  }
}
