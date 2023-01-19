package irvine.oeis.a112;

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a058.A058103;
import irvine.oeis.transform.EulerTransform;
import irvine.oeis.transform.InverseEulerTransform;

/**
 * A112183 McKay-Thompson series of class 40e for the Monster group.
 * @author Georg Fischer
 */
public class A112183 extends Sequence0 {

  // (T10b + 4)^(1/4), where T10b = A058103
  private final InverseEulerTransform mIET = new InverseEulerTransform(new PrependSequence(2, new A058103(), 4)) {
    @Override
    public Z next() {
      return super.next().divide(4);
    }
  };
  private final EulerTransform mET = new EulerTransform(0, mIET, 1);

  @Override
  public Z next() {
    return mET.next();
  }
}
