package irvine.oeis.a015;

import irvine.math.z.Z;

/**
 * A015911 Numbers n such that 2^n mod n is odd.
 * @author Sean A. Irvine
 */
public class A015911 extends A015910 {

  @Override
  public Z next() {
    while (true) {
      if (!super.next().isEven()) {
        return mN;
      }
    }
  }
}
