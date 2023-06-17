package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A002378 Oblong (or promic, pronic, or heteromecic) numbers: a(n) = n*(n+1).
 * @author Sean A. Irvine
 */
public class A002378 extends AbstractSequence {

  /** Construct the sequence. */
  public A002378() {
    super(0);
  }

  protected Z mN = Z.ZERO;

  @Override
  public Z next() {
    final Z p = mN;
    mN = mN.add(1);
    return p.multiply(mN);
  }
}
