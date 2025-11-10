package irvine.oeis.a081;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a007.A007691;
import irvine.oeis.a054.A054030;

/**
 * A081756 Numbers n such that there is a proper divisor d of n satisfying sigma(d)=n.
 * @author Sean A. Irvine
 */
public class A081756 extends A007691 {

  private final Sequence mS = new A054030();
  private final TreeSet<Z> mA = new TreeSet<>();
  private Z mB = super.next();
  private Z mC = mB.multiply(mS.next());

  @Override
  public Z next() {
    while (mA.isEmpty() || mA.first().compareTo(mB) >= 0) {
      mA.add(mC);
      mB = super.next();
      mC = mB.multiply(mS.next());
    }
    return mA.pollFirst();
  }
}

