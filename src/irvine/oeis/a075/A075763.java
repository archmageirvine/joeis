package irvine.oeis.a075;

import irvine.math.z.Z;
import irvine.oeis.a001.A001003;

/**
 * A075763 Numbers k that divide A001003(k-1).
 * @author Sean A. Irvine
 */
public class A075763 extends A001003 {

  /** Construct the sequence. */
  public A075763() {
    super(1);
  }

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (mN > 0 && t.mod(mN + 1) == 0) {
        return Z.valueOf(mN + 1);
      }
    }
  }
}
