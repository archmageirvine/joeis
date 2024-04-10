package irvine.oeis.a069;

import irvine.math.z.Z;

/**
 * A069176 Numbers n such that n-1, n+1, 2n-1, 2n+1, 4n-1, 4n+1, 8n-1 and 8n+1 are all prime.
 * @author Sean A. Irvine
 */
public class A069176 extends A069175 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final Z p8 = p.multiply(8);
      if (p8.subtract(1).isProbablePrime() && p8.add(1).isProbablePrime()) {
        return p;
      }
    }
  }
}

