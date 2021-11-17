package irvine.oeis.a162;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A162722 A positive integer k is included if when k is represented in binary, it contains the binary representations of every distinct prime dividing k as substrings, with overlapping of the substrings allowed (but not necessary).
 * @author Sean A. Irvine
 */
public class A162722 implements Sequence {

  private Z mN = Z.ONE;

  protected boolean check(final String s, final FactorSequence fs) {
    for (final Z p : fs.toZArray()) {
      if (!s.contains(p.toString(2))) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (mN.isPrime()) {
        return mN;
      }
      if (check(mN.toString(2), Cheetah.factor(mN))) {
        return mN;
      }
    }
  }
}

