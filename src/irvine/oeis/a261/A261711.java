package irvine.oeis.a261;
// manually fract22/trigf at 2023-05-28 19:10

import irvine.math.z.Z;
import irvine.oeis.triangle.GeneratingFunctionTriangle;

/**
 * A261711 Triangle read by rows: T(n,k) is the number of words over alphabet {0,1,2,3} having exactly k occurrences of the string 01, where n&gt;=0 and k&gt;=0.
 * @author Georg Fischer
 */
public class A261711 extends GeneratingFunctionTriangle {

  /** Construct the sequence. */
  public A261711() {
    super(0, new long[] {1}, new long[] {1, -4, 0, 1, -1, 0, 0, 0, 0, 0});
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
