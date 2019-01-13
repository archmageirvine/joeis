package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003341.
 * @author Sean A. Irvine
 */
public class A003341 implements Sequence {

  private Z mN = Z.SIX;

  protected int power() {
    return 4;
  }
  
  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      for (Z t = mN.root(power()); t.compareTo(Z.ONE) >= 0; t = t.subtract(1)) {
        final Z k = mN.subtract(t.pow(power()));
        if (k.compareTo(Z.SIX) >= 0) {
          for (Z u = k.root(power()); u.compareTo(t) >= 0; u = u.subtract(1)) {
            final Z j = k.subtract(u.pow(power()));
            if (j.compareTo(Z.FIVE) >= 0) {
              for (Z v = k.root(power()); v.compareTo(u) >= 0; v = v.subtract(1)) {
                final Z i = j.subtract(v.pow(power()));
                if (i.compareTo(Z.FOUR) >= 0) {
                  for (Z w = j.root(power()); w.compareTo(v) >= 0; w = w.subtract(1)) {
                    final Z h = i.subtract(w.pow(power()));
                    if (h.compareTo(Z.THREE) >= 0) {
                      for (Z x = h.root(power()); x.compareTo(w) >= 0; x = x.subtract(1)) {
                        final Z g = h.subtract(x.pow(power()));
                        if (g.compareTo(Z.TWO) >= 0) {
                          for (Z y = g.root(power()); y.compareTo(x) >= 0; y = y.subtract(1)) {
                            final Z f = g.subtract(y.pow(power()));
                            if (f.signum() > 0) {
                              f.root(power());
                              if (f.auxiliary() == 1) {
                                return mN;
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
          }
        }
      }
    }
  }
}
