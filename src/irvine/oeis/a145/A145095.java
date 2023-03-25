package irvine.oeis.a145;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a282.A282050;

/**
 * A145095 Coefficients in expansion of Eisenstein series -q*E'_6.
 * @author Georg Fischer
 */
public class A145095 extends Sequence1 {

  private long mN = 0;
  private final A282050 mSeq = new A282050();

  {
    mSeq.next();
  }

  @Override
  public Z next() {
    ++mN;
    return mSeq.next().multiply(504);
  }
}
