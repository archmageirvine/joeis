package irvine.oeis.a384;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.a000.A000037;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A384924 a(n) is the position of the first occurrence of the digit 0 among the leading significant decimal digits of the square root of the n-th nonsquare.
 * @author Sean A. Irvine
 */
public class A384924 extends A000037 {

  @Override
  public Z next() {
    final DecimalExpansionSequence seq = new DecimalExpansionSequence(CR.valueOf(super.next()).sqrt());
    long cnt = 1;
    while (!seq.next().isZero()) {
      ++cnt;
    }
    return Z.valueOf(cnt);
  }
}

