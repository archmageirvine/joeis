package irvine.oeis.a077;

import java.util.HashSet;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A077094 Numbers k such that iterating phi(sigma(k)-phi(k)) starting from k leads to the fixed point 4.
 * @author Sean A. Irvine
 */
public class A077094 extends Sequence1 {

  private final Z mTarget;
  private long mN = 3;

  protected A077094(final Z target) {
    mTarget = target;
  }

  /** Construct the sequence. */
  public A077094() {
    this(Z.FOUR);
  }

  private Z f(final Z n) {
    return Functions.PHI.z(Functions.SIGMA1.z(n).subtract(Functions.PHI.z(n)));
  }

  @Override
  public Z next() {
    while (true) {
      final HashSet<Z> seen = new HashSet<>();
      final Z n = Z.valueOf(++mN);
      Z t = n;
      seen.add(t);
      while (seen.add(t = f(t))) {
        // do nothing
      }
      if (t.equals(mTarget)) {
        return n;
      }
    }
  }
}

