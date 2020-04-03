package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.FiniteSequence;

/**
 * A030512 Concatenation of first <code>n 2-digit</code> positive integers including leading zeros.
 * @author Sean A. Irvine
 */
public class A030512 extends FiniteSequence {

  private static Z[] build() {
    final Z[] res = new Z[99];
    res[0] = Z.ONE;
    for (int k = 1; k < res.length; ++k) {
      res[k] = res[k - 1].multiply(100).add(k + 1);
    }
    return res;
  }

  /** Construct the sequence. */
  public A030512() {
    super(build());
  }
}

