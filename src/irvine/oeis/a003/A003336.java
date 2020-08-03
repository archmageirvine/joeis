package irvine.oeis.a003;

import java.util.ArrayList;
import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003336 Numbers that are the sum of 2 nonzero 4th powers.
 * @author Sean A. Irvine
 */
public class A003336 implements Sequence {

  protected final TreeSet<Z> mA = new TreeSet<>();
  private final ArrayList<Z> mPowers = new ArrayList<>();
  protected int mM = min(); // mM^power() is next to be considered

  protected int power() {
    return 4;
  }

  protected int min() {
    return 1;
  }

  protected int numberTerms() {
    return 2;
  }

  // Remembers powers, computing new powers as needed
  protected Z pow(final int n) {
    while (n >= mPowers.size()) {
      mPowers.add(Z.valueOf(mPowers.size()).pow(power()));
    }
    return mPowers.get(n);
  }

  @Override
  public Z next() {
    while (mA.isEmpty() || mA.first().compareTo(pow(mM)) > 0) {
      final Z mp = pow(mM);
      for (int k = min(); k <= mM; ++k) {
        mA.add(mp.add(pow(k)));  // i.e. m^p + k^p, k >= 1
      }
      ++mM;
    }
    return mA.pollFirst();
  }
}
