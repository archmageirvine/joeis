package irvine.oeis.a112;

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.Sequence0;
import irvine.oeis.transform.EulerTransform;
import irvine.oeis.transform.InverseEulerTransform;

/**
 * A112168 McKay-Thompson series of class 27e for the Monster group.
 * @author Georg Fischer
 */
public class A112168 extends Sequence0 {

  // (T9b - 3*q)^(1/3), where T9b = A114146
  private final InverseEulerTransform mIET = new InverseEulerTransform(new PrependSequence(2, new A112146(), -3)) {
    @Override
    public Z next() {
      final Z result = super.next().divide(3);
      //System.out.println("IET=" + result);
      return result;
    }
  };
  private final EulerTransform mET = new EulerTransform(0, mIET, 1);

  @Override
  public Z next() {
    return mET.next();
  }
}
