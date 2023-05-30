package irvine.oeis.a092;
// manually fract21/trigf at 2023-05-27 19:57

import irvine.math.z.Z;
import irvine.oeis.triangle.GeneratingFunctionTriangle;

/**
 * A092865 Nonzero elements in Klee's identity Sum[(-1)^k binomial[n,k]binomial[n+k,m],{k,0,n}] == (-1)^n binomial[n,m-n].
 * @author Georg Fischer
 */
public class A092865 extends GeneratingFunctionTriangle {

  /** Construct the sequence. */
  public A092865() {
    super(0, new long[] {1}, new long[] {1, 0, 1, 0, 1, 0, 0, 0, 0, 0});
  }

  @Override
  public Z next() {
    while (true) {
      final Z result = super.next();
      if (!result.isZero()) {
        return result;
      }
    }
  }
}
