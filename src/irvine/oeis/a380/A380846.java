package irvine.oeis.a380;
// Generated by gen_seq4.pl 2025-02-10.ack/filnum at 2025-02-10 21:26

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.FilterNumberSequence;

/**
 * A380846 Numbers k such that A380845(k) = 2*k.
 * @author Georg Fischer
 */
public class A380846 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A380846() {
    super(1, 1, k -> {
      final int h = Functions.DIGIT_SUM.i(2, k);
      return Integers.SINGLETON.sumdiv(k, d -> (Functions.DIGIT_SUM.i(2, d) == h ? Z.ONE : Z.ZERO).multiply(d)).compareTo(Z.valueOf(2L * k)) == 0;
    });
  }
}
