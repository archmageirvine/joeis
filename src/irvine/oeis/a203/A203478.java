package irvine.oeis.a203;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a028.A028362;

/**
 * A203478 a(n) = v(n+1)/v(n), where v = A203477.
 * @author Georg Fischer
 */
public class A203478 extends Sequence1 {

  private final Sequence mA028362 = new A028362().skip(2);
  private long mN;

  @Override
  public Z next() {
    ++mN;
    return mA028362.next().multiply(Z.TWO.pow(Z.valueOf(mN).multiply(Z.valueOf(mN).subtract(Z.ONE)).divide(Z.TWO)));
  }

}
