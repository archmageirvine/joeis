package irvine.oeis.a094;
// manually convprom/convprod at 2023-02-24 12:03

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.oeis.a023.A023532;

/**
 * A094945 Initial n terms of A023532(n) taken as digits.
 * @author Georg Fischer
 */
public class A094945 extends Sequence0 {

  private final A023532 mSeq = new A023532();
  private StringBuilder mSb = new StringBuilder();

  @Override
  public Z next() {
    mSb.append(mSeq.next().toString());
    return new Z(mSb.toString());
  }
}
