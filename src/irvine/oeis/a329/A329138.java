package irvine.oeis.a329;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000027;

/**
 * A329138 Numbers whose prime signature is a necklace.
 * @author Gregory Morse
 */
public class A329138 extends FilterSequence {
  protected A329138(final boolean complement) {
    super(1, new A000027(), n -> necklace(n) != complement);
  }

  /** Construct the sequence. */
  public A329138() {
    this(false);
  }

  private static boolean necklace(final Z n) {
    if (Z.ONE.equals(n)) {
      return false;
    }
    final FactorSequence factor = Jaguar.factor(n);
    final Z[] primes = factor.toZArray();
    final int[] a = new int[primes.length];
    for (int k = 0; k < a.length; ++k) {
      a[k] = factor.getExponent(primes[k]);
    }
    for (int k = 1; k < a.length; ++k) {
      for (int j = 0; j < a.length; ++j) {
        final int b = a[(k + j) % a.length];
        if (a[j] > b) {
          return false;
        }
        if (a[j] < b) {
          break;
        }
      }
    }
    return true;
  }
}
