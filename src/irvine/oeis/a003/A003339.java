package irvine.oeis.a003;

import irvine.math.z.Z;

/**
 * A003339 Numbers that are the sum of 5 nonzero 4th powers.
 * @author Sean A. Irvine
 */
public class A003339 extends A003336 {

  @Override
  public Z next() {
    while (mA.isEmpty() || mA.first().compareTo(pow(mM)) > 0) {
      final Z z1 = pow(mM);
      for (int k2 = 1; k2 <= mM; ++k2) {
        final Z z2 = z1.add(pow(k2));
        for (int k3 = k2; k3 <= mM; ++k3) {
          final Z z3 = z2.add(pow(k3));
          for (int k4 = k3; k4 <= mM; ++k4) {
            final Z z4 = z3.add(pow(k4));
            for (int k5 = k4; k5 <= mM; ++k5) {
              mA.add(z4.add(pow(k5)));
            }
          }
        }
      }
      ++mM;
    }
    return mA.pollFirst();
  }
}
