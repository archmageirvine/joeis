package irvine.oeis.a002;

import irvine.math.group.IntegersMod;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;

/**
 * A002326 Multiplicative order of 2 mod 2n+1.
 * @author Sean A. Irvine
 */
public class A002326 extends AbstractSequence implements DirectSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A002326(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A002326() {
    super(0);
  }

  protected Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(2);
    return new IntegersMod(mN).ord(Z.TWO.mod(mN));
  }

  @Override
  public Z a(final Z n) {
    final Z n21 = n.multiply(2).add(1);
    return new IntegersMod(n21).ord(Z.TWO.mod(n21));
  }

  @Override
  public Z a(final int n) {
    final Z n21 = Z.valueOf(2L * n + 1);
    return new IntegersMod(n21).ord(Z.TWO.mod(n21));
  }
}
