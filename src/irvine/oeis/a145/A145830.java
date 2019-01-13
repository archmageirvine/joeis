package irvine.oeis.a145;

import irvine.math.z.Z;

/**
 * A145830.
 * @author Sean A. Irvine
 */
public class A145830 extends A145768 {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));

  @Override
  public Z next() {
    while (super.next().bitCount() != 1) {
      if (mVerbose && (mN & 0xFFFFFF) == 0) {
        System.err.println("[" + mN + "]");
      }
    }
    return Z.valueOf(mN);
  }

}

