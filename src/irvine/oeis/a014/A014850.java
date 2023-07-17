package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.a000.A000340;

/**
 * A014850 Numbers k that divide s(k), where s(1)=1, s(j)=3*s(j-1)+j.
 * @author Sean A. Irvine
 */
public class A014850 extends A000340 {

  /** Construct the sequence. */
  public A014850() {
    super(1);
  }

  @Override
  public Z next() {
    while (true) {
      if (super.next().mod(mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
