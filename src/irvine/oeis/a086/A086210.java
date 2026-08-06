package irvine.oeis.a086;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a033.A033308;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A086210 Concatenate the odd primes: .357111317...; double that number, break it up where the primes were joined.
 * @author Sean A. Irvine
 */
public class A086210 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private final Sequence mS = new DecimalExpansionSequence(DecimalExpansionSequence.create(new A033308()).getCR().multiply(10).frac().multiply(2));
  private long mP = 2;

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP);
    Z v = Z.ZERO;
    for (int k = 0; k < Functions.DIGIT_LENGTH.i(mP); ++k) {
      v = v.multiply(10).add(mS.next());
    }
    return v;
  }
}
