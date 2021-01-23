package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003602 Kimberling's paraphrases: if n = (2k-1)*2^m then a(n) = k.
 * @author Sean A. Irvine
 */
public class A003602 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.makeOdd().add(1).divide2();
  }
}
