package irvine.oeis.a070;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000040;

/**
 * A070270 Primes for which the smallest positive primitive root is even and nonprime.
 * @author Sean A. Irvine
 */
public class A070270 extends FilterSequence {

  /** Construct the sequence. */
  public A070270() {
    super(1, new A000040(), k -> {
      final Z lpr = Functions.LEAST_PRIMITIVE_ROOT.z(k);
      return lpr.isEven() && !lpr.isProbablePrime();
    });
  }
}
