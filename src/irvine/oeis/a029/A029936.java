package irvine.oeis.a029;

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.SkipSequence;

/**
 * A029936 Number of cusps of Gamma_1(n)\P_1(Q).
 * @author Sean A. Irvine
 */
public class A029936 extends PrependSequence {

  /** Construct the sequence. */
  public A029936() {
    super(1, new SkipSequence(new A029935(), 4) {
      @Override
      public Z next() {
        return super.next().divide2();
      }
    }, 1, 2, 2, 3);
  }
}
