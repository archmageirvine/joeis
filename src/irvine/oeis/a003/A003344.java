package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003344.
 * @author Sean A. Irvine
 */
public class A003344 implements Sequence {

  private Z mN = Z.NINE;

  protected int power() {
    return 4;
  }

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      for (Z t = mN.root(power()); t.compareTo(Z.ONE) >= 0; t = t.subtract(1)) {
        final Z k = mN.subtract(t.pow(power()));
        if (k.compareTo(Z.NINE) >= 0) {
          for (Z u = k.root(power()); u.compareTo(t) >= 0; u = u.subtract(1)) {
            final Z j = k.subtract(u.pow(power()));
            if (j.compareTo(Z.EIGHT) >= 0) {
              for (Z v = k.root(power()); v.compareTo(u) >= 0; v = v.subtract(1)) {
                final Z i = j.subtract(v.pow(power()));
                if (i.compareTo(Z.SEVEN) >= 0) {
                  for (Z w = j.root(power()); w.compareTo(v) >= 0; w = w.subtract(1)) {
                    final Z h = i.subtract(w.pow(power()));
                    if (h.compareTo(Z.SIX) >= 0) {
                      for (Z x = h.root(power()); x.compareTo(w) >= 0; x = x.subtract(1)) {
                        final Z g = h.subtract(x.pow(power()));
                        if (g.compareTo(Z.FIVE) >= 0) {
                          for (Z y = g.root(power()); y.compareTo(x) >= 0; y = y.subtract(1)) {
                            final Z f = g.subtract(y.pow(power()));
                            if (f.compareTo(Z.FOUR) >= 0) {
                              for (Z z = f.root(power()); z.compareTo(y) >= 0; z = z.subtract(1)) {
                                final Z e = f.subtract(z.pow(power()));
                                if (e.compareTo(Z.THREE) >= 0) {
                                  for (Z s = e.root(power()); s.compareTo(z) >= 0; s = s.subtract(1)) {
                                    final Z d = e.subtract(s.pow(power()));
                                    if (d.compareTo(Z.TWO) >= 0) {
                                      for (Z r = d.root(power()); r.compareTo(s) >= 0; r = r.subtract(1)) {
                                        final Z c = d.subtract(r.pow(power()));
                                        if (c.signum() > 0) {
                                          c.root(power());
                                          if (c.auxiliary() == 1) {
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
          }
        }
      }
    }
  }
}
