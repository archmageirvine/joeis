package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000120 <code>1's-counting</code> sequence: number of <code>1</code>'s in binary expansion of <code>n (or</code> the binary weight of <code>n)</code>.
 * @author Sean A. Irvine
 */
public class A000120 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return Z.valueOf(mN.bitCount());
  }
}

