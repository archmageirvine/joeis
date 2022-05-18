package irvine.oeis.a002;

import java.util.ArrayList;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;

/**
 * A002076 Number of equivalence classes of base-3 necklaces of length n, where necklaces are considered equivalent under both rotations and permutations of the symbols.
 * @author Sean A. Irvine
 */
public class A002076 extends A002075 {

  private final ArrayList<Z> mA = new ArrayList<>();
  private boolean mFirst = true;

  @Override
  public Z next() {
    if (mFirst) {
      mFirst = false;
      return Z.ONE;
    }
    mA.add(super.next());
    Z s = Z.ZERO;
    for (final Z dd : Jaguar.factor(mA.size()).divisors()) {
      final int d = dd.intValue();
      s = s.add(mA.get(d - 1));
    }
    return s;
  }
}
