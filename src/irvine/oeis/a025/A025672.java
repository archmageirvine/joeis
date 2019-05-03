package irvine.oeis.a025;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

import java.util.TreeSet;

/**
 * A025672 Exponent of <code>8</code> (value of <code>j)</code> in n-th number of form <code>3^i*8^j</code>.
 * @author Sean A. Irvine
 */
public class A025672 implements Sequence {

  private final TreeSet<Z> mCandidates = new TreeSet<>();
  private Z mT = Z.THREE;

  //private int mN = 0;

  @Override
  public Z next() {
    while (mCandidates.isEmpty() || mCandidates.first().compareTo(mT) > 0) {
      mCandidates.add(mT);
      mT = mT.multiply(3);
    }
    final Z r = mCandidates.first();
    mCandidates.remove(r);
    mCandidates.add(r.shiftLeft(3));
    r.makeOdd();
    final long power = r.auxiliary() / 3;

    // Following is a bogus formula suggested Mircea Merca
    /*
    ++mN;
    final long c0 = (int) Math.ceil(2 * Math.sqrt(mN));
    final long v = c0 * c0 / 4 - mN;
    if (power != v) {
      System.out.println(mN + " mircea=" + v + " truth=" + power);
    }
    */

    return Z.valueOf(power);
  }

}

