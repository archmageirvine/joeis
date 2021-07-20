package irvine.oeis.a007;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A007404 Decimal expansion of Sum_{n&gt;=0} 1/2^(2^n).
 * @author Sean A. Irvine
 */
public class A007404 extends DecimalExpansionSequence {

  private static CR build() {
    CR n = CR.HALF;
    for (int k = 1; k < 31; ++k) {
      n = n.add(CR.valueOf(Z.ONE.shiftLeft(1 << k)).inverse());
    }
    return n;
  }

  /** Construct the sequence. */
  public A007404() {
    super(build());
  }
}
