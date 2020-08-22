package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026612 a(n) = number of 1's between n-th 3 and (n+1)st 3 in A026600.
 * @author Sean A. Irvine
 */
public class A026612 extends A026600 {

  {
    super.next(); // first 1
    super.next(); // first 2
    super.next(); // first 3
  }

  @Override
  public Z next() {
    long c = 0;
    while (true) {
      final Z t = super.next();
      if (Z.THREE.equals(t)) {
        return Z.valueOf(c);
      } else if (Z.ONE.equals(t)) {
        ++c;
      }
    }
  }
}
