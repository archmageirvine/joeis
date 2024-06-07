package irvine.oeis.a070;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000040;

/**
 * A070269 Primes for which the smallest positive primitive root is odd and nonprime.
 * @author Sean A. Irvine
 */
public class A070269 extends FilterSequence {

  /** Construct the sequence. */
  public A070269() {
    super(1, new A000040(), k -> {
      final Z lpr = Functions.LEAST_PRIMITIVE_ROOT.z(k);
      return lpr.isOdd() && !lpr.isProbablePrime();
    });
  }
}
