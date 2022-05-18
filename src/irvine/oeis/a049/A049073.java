package irvine.oeis.a049;

import java.util.TreeSet;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a000.A000961;

/**
 * A049073 LCM of all divisors of d of n such that d+1 is a prime power.
 * @author Sean A. Irvine
 */
public class A049073 extends A000961 {

  private final TreeSet<Z> mPrimePowers = new TreeSet<>();
  {
    mPrimePowers.add(super.next()); // avoid need to check for empty later
  }
  private long mN = 0;

  @Override
  public Z next() {
    Z lcm = Z.ONE;
    for (final Z d : Jaguar.factor(++mN).divisors()) {
      final Z e = d.add(1);
      while (e.compareTo(mPrimePowers.last()) > 0) {
        mPrimePowers.add(super.next());
      }
      if (mPrimePowers.contains(e)) {
        lcm = lcm.lcm(d);
      }
    }
    return lcm;
  }
}
