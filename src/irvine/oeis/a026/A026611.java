package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026611 Number of <code>3</code>'s between <code>n-th 2</code> and <code>(n+1)st 2</code> in <code>A026600</code>.
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
