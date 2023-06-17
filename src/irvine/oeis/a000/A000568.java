package irvine.oeis.a000;

import irvine.math.IntegerUtils;
import irvine.math.group.SymmetricGroup;
import irvine.math.partitions.IntegerPartition;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A000568 Number of outcomes of unlabeled n-team round-robin tournaments.
 * @author Sean A. Irvine
 */
public class A000568 extends AbstractSequence {

  /* Construct the sequence. */
  public A000568() {
    super(0);
  }

  protected int mN = -1;

  private boolean isOddParts(final int[] p) {
    for (final int v : p) {
      if ((v & 1) == 0) {
        return false;
      }
    }
    return true;
  }

  private int t(final int[] j) {
    int sum = 0;
    for (int r = 0; r < j.length; ++r) {
      for (int s = 0; s < j.length; ++s) {
        sum += j[r] * j[s] * IntegerUtils.gcd(r, s);
      }
      sum -= j[r];
    }
    return sum / 2;
  }

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    final IntegerPartition ip = new IntegerPartition(mN);
    final int[] a = new int[mN + 1];
    Q s = Q.ZERO;
    int[] p;
    while ((p = ip.next()) != null) {
      if (isOddParts(p)) {
        IntegerPartition.toCountForm(p, a);
        s = s.add(new Q(Z.ONE.shiftLeft(t(a)), SymmetricGroup.per(a)));
      }
    }
    return s.toZ();
  }
}
