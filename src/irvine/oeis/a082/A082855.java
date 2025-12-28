package irvine.oeis.a082;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a014.A014137;
import irvine.oeis.a081.A081288;

/**
 * A082855 a(0)=0, a(1)=1, a(n) = A014137(A081288(n-1)-1).
 * @author Sean A. Irvine
 */
public class A082855 extends Sequence0 {

  private final Sequence mA = new A081288();
  private final DirectSequence mS = DirectSequence.create(new A014137());
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ZERO;
    }
    return mS.a(mA.next().subtract(1));
  }
}
