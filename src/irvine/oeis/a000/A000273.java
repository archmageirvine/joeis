package irvine.oeis.a000;

import irvine.math.function.Functions;
import irvine.math.group.SymmetricGroup;
import irvine.math.partition.IntegerPartition;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A000273 Number of unlabeled simple digraphs with n nodes.
 * @author Sean A. Irvine
 */
public class A000273 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A000273(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A000273() {
    super(0);
  }

  protected int mN = -1;

  protected int g(final int ord, final int[] a) {
    int g = 0;
    for (int d = 1; d <= ord; ++d) {
      if (ord % d == 0) {
        int g1 = 0;
        final int lim = Math.min(mN, d);
        for (int del = 1; del <= lim; ++del) {
          if (d % del == 0) {
            g1 += del * a[del];
          }
        }
        g += g1 * Functions.PHI.l(ord / d) * (g1 - 1);
      }
    }
    return g;
  }

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    // I think this algorithm is due to Harary
    // I'm not sure how far it can be pushed before overflow
    final IntegerPartition ip = new IntegerPartition(mN);
    final int[] a = new int[mN + 1];
    Q s = Q.ZERO;
    int[] p;
    while ((p = ip.next()) != null) {
      IntegerPartition.toCountForm(p, a);
      final int ord = IntegerPartition.ord(a);
      s = s.add(new Q(Z.ONE.shiftLeft(g(ord, a) / ord), SymmetricGroup.per(a)));
    }
    return s.toZ();
  }
}
