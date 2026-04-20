package irvine.oeis.a395;

import java.util.HashSet;
import java.util.Set;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A395128 Numbers k that are the concatenation of three divisors of k.
 * @author Sean A. Irvine
 */
public class A395128 extends Sequence1 {

  private long mN = 0;
  private final int mTerms;

  protected A395128(final int terms) {
    mTerms = terms;
  }

  /** Construct the sequence. */
  public A395128() {
    this(3);
  }

  private boolean is(final String n, final Set<String> d, final int remaining) {
    if (n.isEmpty()) {
      return remaining == 0;
    }
    for (int k = 1; k <= n.length(); ++k) {
      if (d.contains(n.substring(0, k)) && is(n.substring(k), d, remaining - 1)) {
        return true;
      }
    }
    return false;
  }

  private boolean is(final long n) {
    final Set<String> divs = new HashSet<>();
    for (final Z d : Jaguar.factor(n).divisors()) {
      divs.add(d.toString());
    }
    return is(String.valueOf(n), divs, mTerms);
  }

  @Override
  public Z next() {
    while (true) {
      if (is(++mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
