package irvine.oeis.a035;

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.a054.A054951;
import irvine.oeis.transform.InverseEulerTransform;

/**
 * A035512 Number of unlabeled strongly connected digraphs with n nodes.
 * @author Sean A. Irvine
 */
public class A035512 extends PrependSequence {

  /** Construct the sequence. */
  public A035512() {
    super(new InverseEulerTransform(new A054951() {
      @Override
      public Z next() {
        return super.next().negate();
      }
    }), -1);
  }

  @Override
  public Z next() {
    return super.next().negate();
  }
}
