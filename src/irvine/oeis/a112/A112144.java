package irvine.oeis.a112;

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a097.A097340;
import irvine.oeis.transform.EulerTransform;
import irvine.oeis.transform.InverseEulerTransform;

/**
 * A112144 McKay-Thompson series of class 8a for the Monster group.
 * @author Georg Fischer
 */
public class A112144 extends Sequence0 {

  // T8a=rootn(e4A-64, 2); e4A=ecalc([2, 2;1,-1;4,-1],[1, 24]) = A097340
  private final InverseEulerTransform mIET = new InverseEulerTransform(new PrependSequence(2, new A097340(), -40)) {
    @Override
    public Z next() {
      return super.next().divide2();
    }
  };
  private final EulerTransform mET = new EulerTransform(0, mIET, 1);

  @Override
  public Z next() {
    return mET.next();
  }
}
