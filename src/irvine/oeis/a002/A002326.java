package irvine.oeis.a002;

import irvine.math.group.IntegersMod;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002326.
 * @author Sean A. Irvine
 */
public class A002326 implements Sequence {

  protected Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(2);
    final IntegersMod ring = new IntegersMod(mN);
    return ring.ord(Z.TWO.mod(mN));
  }
}
