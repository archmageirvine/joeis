package irvine.oeis.a002;

import irvine.math.group.IntegersMod;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A002326 Multiplicative order of 2 mod 2n+1.
 * @author Sean A. Irvine
 */
public class A002326 extends AbstractSequence {

  /* Construct the sequence. */
  public A002326() {
    super(0);
  }

  protected Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(2);
    return new IntegersMod(mN).ord(Z.TWO.mod(mN));
  }
}
