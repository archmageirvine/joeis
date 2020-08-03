package irvine.oeis.a003;

import irvine.math.z.Z;

/**
 * A003337 Numbers n which are the sum of 3 nonzero 4th powers.
 * @author Sean A. Irvine
 */
public class A003337 extends A003336 {

  @Override
  public Z next() {
    while (mA.isEmpty() || mA.first().compareTo(pow(mM)) > 0) {
      final Z z1 = pow(mM);
      for (int k2 = 1; k2 <= mM; ++k2) {
        final Z z2 = z1.add(pow(k2));
        for (int k3 = k2; k3 <= mM; ++k3) {
          mA.add(z2.add(pow(k3)));
        }
      }
      ++mM;
    }
    return mA.pollFirst();
  }
}
