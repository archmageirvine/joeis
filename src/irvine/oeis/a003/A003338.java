package irvine.oeis.a003;

import irvine.math.z.Z;

/**
 * A003338 Numbers that are the sum of 4 nonzero 4th powers.
 * @author Sean A. Irvine
 */
public class A003338 extends A003336 {

  @Override
  public Z next() {
    while (mA.isEmpty() || mA.first().compareTo(pow(mM)) > 0) {
      final Z mp1 = pow(mM);
      for (int k2 = 1; k2 <= mM; ++k2) {
        final Z z2 = mp1.add(pow(k2));
        for (int k3 = k2; k3 <= mM; ++k3) {
          final Z z3 = z2.add(pow(k3));
          for (int k4 = k3; k4 <= mM; ++k4) {
            mA.add(z3.add(pow(k4)));
          }
        }
      }
      ++mM;
    }
    return mA.pollFirst();
  }
}
