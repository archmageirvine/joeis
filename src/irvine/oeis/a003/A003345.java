package irvine.oeis.a003;

import irvine.math.z.Z;

/**
 * A003345 Numbers that are the sum of 11 positive 4th powers.
 * @author Sean A. Irvine
 */
public class A003345 extends A003336 {

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
              final Z z5 = z4.add(pow(k5));
              for (int k6 = k5; k6 <= mM; ++k6) {
                final Z z6 = z5.add(pow(k6));
                for (int k7 = k6; k7 <= mM; ++k7) {
                  final Z z7 = z6.add(pow(k7));
                  for (int k8 = k7; k8 <= mM; ++k8) {
                    final Z z8 = z7.add(pow(k8));
                    for (int k9 = k8; k9 <= mM; ++k9) {
                      final Z z9 = z8.add(pow(k9));
                      for (int ka = k9; ka <= mM; ++ka) {
                        final Z za = z9.add(pow(ka));
                        for (int kb = ka; kb <= mM; ++kb) {
                          mA.add(za.add(pow(kb)));
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
      ++mM;
    }
    return mA.pollFirst();
  }
}
