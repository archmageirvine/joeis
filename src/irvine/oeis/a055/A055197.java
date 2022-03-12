package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.oeis.a005.A005728;

/**
 * A055197 Numbers k such that A005728(k) is not prime.
 * @author Georg Fischer
 */
public class A055197 extends A005728 {

  private int mK = 0;

  /** Construct the sequence. */
  public A055197() {
    super.next();
  }

  @Override
  public Z next() {
    ++mK;
    while (super.next().isProbablePrime()) {
      ++mK;
    }
    return Z.valueOf(mK);
  }
}
