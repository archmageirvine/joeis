package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.oeis.SkipSequence;
import irvine.oeis.a048.A048805;

/**
 * A055370 Matrix inverse of triangle A055363(n+2,k).
 * @author Sean A. Irvine
 */
public class A055370 extends A048805 {

  /** Construct the sequence. */
  public A055370() {
    super(new SkipSequence(new A055363(), 2) {
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
