package irvine.oeis.a047;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A047975 Let (p1,p2), (p3,p4) be two pairs of successive primes such that p1*p2=p3+p4-1, |p2-p1|=|p4-p3|; sequence gives |p2-p1|=|p4-p3|.
 * @author Sean A. Irvine
 */
public class A047975 extends A000040 {

  private Z mP = super.next();

  protected Z select(final Z gap, final Z p1, final Z p3) {
    return gap;
  }

  protected boolean accept(final Z gap) {
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      final Z p1 = mP;
      mP = super.next();
      final Z gap = mP.subtract(p1);
      final Z g2 = gap.divide2();
      final Z t = p1.multiply(mP).add(1).divide2();
      final Z p3 = t.subtract(g2);
      //System.out.println("Trying p1 = " + p1 + " " + gap + " --> p3=" + p3);
      if (mFast.isPrime(p3)) {
        final Z p4 = t.add(g2);
        if (mFast.isPrime(p4) && mFast.nextPrime(p3).equals(p4)) {
          return select(gap, p1, p3);
        }
      }
    }
  }
}
