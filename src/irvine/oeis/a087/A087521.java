package irvine.oeis.a087;

import java.util.HashSet;

import irvine.factor.util.FactorUtils;
import irvine.math.z.Z;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000040;

/**
 * A087521 Smallest prime p such that the prime signature of p+1 has not occurred earlier.
 * @author Sean A. Irvine
 */
public class A087521 extends FilterSequence {

  private static final HashSet<Z> SEEN = new HashSet<>();

  /** Construct the sequence. */
  public A087521() {
    super(1, new A000040(), p -> SEEN.add(FactorUtils.leastPrimeSignature(p.add(1))));
  }
}
