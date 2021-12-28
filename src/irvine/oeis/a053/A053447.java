package irvine.oeis.a053;

import irvine.math.group.IntegersMod;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A053447 Multiplicative order of 4 mod 2n+1.
 * @author Sean A. Irvine
 */
public class A053447 implements Sequence {

  protected Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(2);
    return new IntegersMod(mN).ord(Z.FOUR.mod(mN));
  }
}
