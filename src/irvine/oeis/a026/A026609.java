package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026609 a(n) = number of 3's between n-th 1 and (n+1)st 1 in A026600.
 * @author Sean A. Irvine
 */
public class A026609 extends A026600 {

  {
    super.next(); // first 1
  }

  @Override
  public Z next() {
    long c = 0;
    while (true) {
      final Z t = super.next();
      if (Z.ONE.equals(t)) {
        return Z.valueOf(c);
      } else if (Z.THREE.equals(t)) {
        ++c;
      }
    }
  }
}
