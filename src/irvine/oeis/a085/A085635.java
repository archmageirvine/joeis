package irvine.oeis.a085;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000224;

/**
 * A085635 Compute S, the number of different quadratic residues modulo B for every base B. If the density S/B is smaller for B than for every B' less than B, then B is added to the sequence.
 * @author Sean A. Irvine
 */
public class A085635 extends Sequence1 {

  private final DirectSequence mSeq = new A000224();
  private Q mR = Q.NEG_ONE;
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Q t = Q.ONE.subtract(new Q(mSeq.a(mN), mN));
      if (t.compareTo(mR) > 0) {
        mR = t;
        return Z.valueOf(mN);
      }
    }
  }
}
