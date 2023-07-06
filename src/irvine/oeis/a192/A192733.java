package irvine.oeis.a192;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a004.A004016;
import irvine.oeis.transform.InverseEulerTransform;

/**
 * A192733 Euler transform is sequence A004016.
 * @author Georg Fischer
 */
public class A192733 extends Sequence1 {

  private final InverseEulerTransform mSeq = new InverseEulerTransform(new A004016().skip(1));

  @Override
  public Z next() {
    return mSeq.next();
  }
}
