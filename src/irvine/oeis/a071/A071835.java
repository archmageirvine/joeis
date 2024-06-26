package irvine.oeis.a071;
// Generated by gen_seq4.pl 2024-05-27/filnum at 2024-05-28 02:23

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.FilterNumberSequence;

/**
 * A071835 Numbers k such that the largest prime factor of k is equal to floor(sqrt(k)).
 * @author Georg Fischer
 */
public class A071835 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A071835() {
    super(1, 2, k -> Functions.GPF.z(k).equals(Z.valueOf(k).sqrt()));
  }
}
