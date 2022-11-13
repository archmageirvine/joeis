package irvine.oeis.a060;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a005.A005836;

/**
 * A060372 p(n), positive part of n when n=p(n)-q(n) with p(n), q(n), p(n)+q(n) in A005836, integers written without 2 in base 3.
 * @author Sean A. Irvine
 */
public class A060372 extends Sequence0 {

  protected Z mN = Z.NEG_ONE;
  private final Sequence mT = new A005836();
  private final TreeSet<Z> mA = new TreeSet<>();

  @Override
  public Z next() {
    Z t = mN;
    mN = mN.add(1);
    while (true) {
      t = mA.higher(t);
      if (t == null) {
        t = mT.next();
        mA.add(t);
      }
      if (mA.contains(t.subtract(mN))) {
        return t;
      }
    }
  }
}
