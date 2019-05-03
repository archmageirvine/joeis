package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a106.A106248;
import irvine.oeis.a121.A121591;

/**
 * A007251 McKay-Thompson series of class <code>5A</code> for the Monster group.
 * @author Sean A. Irvine
 */
public class A007251 extends A106248 {

  private Sequence mA = new A121591();
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN < 2) {
      super.next();
      return mN == 0 ? Z.ONE : Z.ZERO;
    }
    return super.next().add(mA.next().multiply(125));
  }
}
