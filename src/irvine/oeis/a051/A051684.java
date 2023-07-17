package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.a001.A001464;

/**
 * A051684 Auxiliary sequence for calculation of number of even permutations of degree n and order exactly 2.
 * @author Sean A. Irvine
 */
public class A051684 extends A001464 {

  /** Construct the sequence. */
  public A051684() {
    super(1);
  }

  {
    super.next();
  }

  private boolean mSign = true;

  @Override
  public Z next() {
    mSign = !mSign;
    return Z.NEG_ONE.signedAdd(mSign, super.next());
  }
}
