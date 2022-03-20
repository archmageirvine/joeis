package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.oeis.SkipSequence;
import irvine.oeis.a048.A048805;

/**
 * A055347 Matrix inverse of triangle A055340(n+1,k).
 * @author Sean A. Irvine
 */
public class A055347 extends A048805 {

  /** Construct the sequence. */
  public A055347() {
    super(new SkipSequence(new A055340(), 1) {
      @Override
      public Z next() {
        Z t;
        while ((t = super.next()).isZero()) {
          // do nothing
        }
        return t;
      }
    });
  }
}
