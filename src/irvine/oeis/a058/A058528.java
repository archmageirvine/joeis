package irvine.oeis.a058;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A058528 Number of n X n (0,1) matrices with all column and row sums equal to 4.
 * @author Sean A. Irvine
 */
public class A058528 implements Sequence {

  // After Shanzhen Gao

  private static final MemoryFactorial F = MemoryFactorial.SINGLETON;
  private static final Z Z24 = Z.valueOf(24);
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Q sum = Q.ZERO;
    for (int alpha = 0; alpha <= mN; ++alpha) {
      for (int beta = 0; alpha + beta <= mN; ++beta) {
        for (int gamma = 0; alpha + beta + gamma <= mN; ++gamma) {
          for (int delta = 0; alpha + beta + gamma + delta <= mN; ++delta) {
            final int u = mN - alpha - beta - gamma - delta;
            assert u >= 0;
            final Q m = new Q(
              Z.THREE.pow(gamma)
                .multiply(Z.valueOf(-6).pow(beta + u))
                .multiply(Z.EIGHT.pow(delta))
                .multiply(F.factorial(mN).square())
                .multiply(F.factorial(4 * alpha + 2 * gamma + delta))
                .multiply(F.factorial(beta + 2 * gamma)),
              F.factorial(alpha)
                .multiply(F.factorial(beta))
                .multiply(F.factorial(gamma))
                .multiply(F.factorial(delta))
                .multiply(F.factorial(u))
              );
            Q s = Q.ZERO;
            for (int i = 0; i <= (beta + 2 * gamma) / 2; ++i) {
              if (alpha - gamma + i >= 0) { // todo where should this condition be enforced
                final Q t = new Q(
                  F.factorial(i).multiply(F.factorial(beta + 2 * gamma - 2 * i)).multiply(F.factorial(alpha - gamma + i)),
                  Z24.pow(alpha - gamma + i).shiftLeft(beta + 2 * gamma - i)
                );
                s = s.add(t);
              }
            }
            sum = sum.add(s.multiply(m));
          }
        }
      }
    }
    return sum.divide(Z24.pow(mN)).toZ();
  }
}

/*
a(n) = 24^{-n} sum_{alpha +beta + gamma + mu + u =n}
    frac{
       3^{ gamma }(-6)^{beta +u }8^{ mu }(n!)^{2}(4alpha +2 gamma + mu )!(beta +2 gamma )!
       }
       {alpha!beta! gamma! mu!u!}
    sum_{i=0}^{ floor (beta +2 gamma )/2 }frac{1}{24^{alpha - gamma +i}2^{beta +2 gamma -i}i!(beta +2 gamma -2i)!(alpha - gamma +i)!}
 */
