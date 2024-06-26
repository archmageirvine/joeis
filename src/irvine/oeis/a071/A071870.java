package irvine.oeis.a071;
// Generated by gen_seq4.pl 2024-05-27/filnum at 2024-05-28 02:23

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.FilterNumberSequence;

/**
 * A071870 Numbers k such that gpf(k) &gt; gpf(k+1) &gt; gpf(k+2) where gpf(k) denotes the largest prime factor of k.
 * @author Georg Fischer
 */
public class A071870 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A071870() {
    super(1, 1, k -> {
      final Z mid = Functions.GPF.z(k + 1);
      return Functions.GPF.z(k).compareTo(mid) > 0 && mid.compareTo(Functions.GPF.z(k + 2)) > 0;
    });
  }
}
