package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026611 Number of 3's between n-th 2 and (n+1)st 2 in A026600.
 * @author Sean A. Irvine
 */
public class A026611 extends A026600 {

  {
    super.next(); // first 1
    super.next(); // first 2
  }

  @Override
  public Z next() {
    long c = 0;
    while (true) {
      final Z t = super.next();
      if (Z.TWO.equals(t)) {
        return Z.valueOf(c);
      } else if (Z.THREE.equals(t)) {
        ++c;
      }
    }
  }
}
