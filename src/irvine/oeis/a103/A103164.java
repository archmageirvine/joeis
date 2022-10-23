package irvine.oeis.a103;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A103164 Integers but with the primes squared.
 * @author Georg Fischer
 */
public class A103164 extends Sequence0 {

  private int mN;

  /** Construct the sequence. */
  public A103164() {
    mN = -1;
  }

  @Override
  public Z next() {
    final Z n = Z.valueOf(++mN);
    return n.isPrime() ? n.square() : n;
  }
}
