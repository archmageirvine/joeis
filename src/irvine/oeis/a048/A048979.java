package irvine.oeis.a048;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.prime.PrimeSubsequence;
import irvine.oeis.a011.A011784;

/**
 * A048979 Primes in A011784.
 * @author Sean A. Irvine
 */
public class A048979 extends PrimeSubsequence {

  private final HashSet<Z> mSeen = new HashSet<>();

  /** Construct the sequence. */
  public A048979() {
    super(new A011784());
  }

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (mSeen.add(t)) {
        return t;
      }
    }
  }
}
