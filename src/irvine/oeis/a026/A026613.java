package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026613 Number of <code>2</code>'s between <code>n-th 3</code> and <code>(n+1)st 3</code> in <code>A026600</code>.
 * @author Sean A. Irvine
 */
public class A026613 extends A026600 {

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
      } else if (Z.TWO.equals(t)) {
        ++c;
      }
    }
  }
}
