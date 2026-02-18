package irvine.oeis.a083;

import java.util.TreeSet;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a006.A006567;

/**
 * A083815 Semiprimes whose prime factors are distinct and the reversal of one factor is equal to the other.
 * @author Sean A. Irvine
 */
public class A083815 extends A006567 {

  private final TreeSet<Z> mA = new TreeSet<>();
  private Z mT = super.next();

  @Override
  public Z next() {
    while (mA.isEmpty() || mT.square().compareTo(mA.first()) <= 0) {
      final Z r = Functions.REVERSE.z(mT);
      if (r.compareTo(mT) > 0) {
        mA.add(mT.multiply(r));
      }
      mT = super.next();
    }
    return mA.pollFirst();
  }
}
