package irvine.oeis.a384;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.a000.A000037;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A384923 a(n) is the smallest number of leading significant digits of the square root of the n-th nonsquare that includes all decimal digits.
 * @author Sean A. Irvine
 */
public class A384923 extends A000037 {

  @Override
  public Z next() {
    final DecimalExpansionSequence seq = new DecimalExpansionSequence(CR.valueOf(super.next()).sqrt());
    int syn = 0;
    long cnt = 0;
    while (syn != 0b1111111111) {
      syn |= 1 << seq.next().intValue();
      ++cnt;
    }
    return Z.valueOf(cnt);
  }
}

