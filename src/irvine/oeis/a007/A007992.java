package irvine.oeis.a007;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007992 Augmented amicable pairs (smaller member of each pair).
 * @author Sean A. Irvine
 */
public class A007992 implements Sequence {

  private Z mN = Z.valueOf(6159);

  private Z augmentedAliquot(final Z n) {
    if (n.isProbablePrime()) {
      return Z.ONE;
    }
    final FactorSequence fs = Jaguar.factor(n);
    return fs.sigma().subtract(n).add(1);
  }

  protected Z select(final Z small, final Z big) {
    return small;
  }

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z a = augmentedAliquot(mN);
      if (a.compareTo(mN) > 0 && augmentedAliquot(a).equals(mN)) {
        return select(mN, a);
      }
    }
  }
}
