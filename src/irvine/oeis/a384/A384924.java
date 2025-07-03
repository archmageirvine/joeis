package irvine.oeis.a384;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.a000.A000037;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A384924 allocated for Felix Huber.
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

