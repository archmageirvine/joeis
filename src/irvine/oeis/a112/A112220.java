package irvine.oeis.a112;

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a058.A058659;
import irvine.oeis.transform.EulerTransform;
import irvine.oeis.transform.InverseEulerTransform;

/**
 * A112220 McKay-Thompson series of class 117a for the Monster group.
 * @author Georg Fischer
 */
public class A112220 extends Sequence0 {

  // (T39A + 3)^(1/3) in powers of q, where T39A = A058659.
  private final InverseEulerTransform mIET = new InverseEulerTransform(new PrependSequence(2, new A058659(), 3)) {
    @Override
    public Z next() {
      return super.next().divide(3);
    }
  };
  private final EulerTransform mET = new EulerTransform(0, mIET, 1);

  @Override
  public Z next() {
    return mET.next();
  }
}
