package irvine.oeis.a049;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000142;
import irvine.oeis.a034.A034386;

/**
 * A049420 Composite numbers n such that (n!/n#)+1 is prime, where n# = primorial numbers A034386.
 * @author Sean A. Irvine
 */
public class A049420 extends A000142 {

  private final Sequence mPrimorial = new A034386();
  private Z mN = Z.ONE;
  {
    setOffset(1);
    super.next();
    super.next();
    mPrimorial.next();
    mPrimorial.next();
  }

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z t = super.next().divide(mPrimorial.next());
      if (!mN.isProbablePrime() && t.add(1).isProbablePrime()) {
        return mN;
      }
    }
  }
}

