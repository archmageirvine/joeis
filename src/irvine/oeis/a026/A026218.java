package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026218 a(n) = (1/3)*(s(n) + 2), where s(n) is the n-th number congruent to 1 mod 3 in A026177.
 * @author Sean A. Irvine
 */
public class A026218 extends A026177 {

  @Override
  public Z next() {
    Z t;
    do {
      t = super.next();
    } while (t.mod(3) != 1);
    return t.add(2).divide(3);
  }
}
