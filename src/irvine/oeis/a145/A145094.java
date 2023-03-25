package irvine.oeis.a145;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a001.A001158;

/**
 * A145094 Coefficients in expansion of Eisenstein series q*E'_4.
 * @author Georg Fischer
 */
public class A145094 extends Sequence1 {

  private long mN = 0;
  private final A001158 mSeq = new A001158();

  @Override
  public Z next() {
    ++mN;
    return mSeq.next().multiply(240 * mN);
  }
}
