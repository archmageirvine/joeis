package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004068.
 * @author Sean A. Irvine
 */
public class A004068 implements Sequence {

  protected long mN = -1;

  @Override
  public Z next() {
    final Z n = Z.valueOf(++mN);
    return n.square().multiply(5).add(1).multiply(n).divide(6);
  }
}
