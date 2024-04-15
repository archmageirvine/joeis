package irvine.oeis.a070;
// manually 2024-02-07/dirtral at 2024-02-07 14:25

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.transform.TupleTransformSequence;

/**
 * A070319 a(n) = Max_{k=1..n} tau(k) where tau(x)=A000005(x) is the number of divisors of x.
 * @author Georg Fischer
 */
public class A070319 extends TupleTransformSequence {

  /** Construct the sequence. */
  public A070319() {
    super(1, (n, s) -> {
      final Z taun = Functions.SIGMA0.z(n);
      return taun.compareTo(s[0]) > 0 ? taun : s[0];
    }, "1", PREVIOUS);
  }
}
