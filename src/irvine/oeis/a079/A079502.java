package irvine.oeis.a079;

import java.util.ArrayList;

import irvine.math.MemoryFunction1;
import irvine.math.z.Z;
import irvine.oeis.DifferenceSequence;
import irvine.oeis.LookaheadSequence;
import irvine.oeis.Sequence;
import irvine.oeis.a050.A050447;

/**
 * A079502 Triangle T(n,k) read by rows; related to number of preorders.
 * @author Sean A. Irvine
 */
public class A079502 extends MemoryFunction1<Z[]> implements Sequence {

  private final A050447 mP = new A050447();

  private final class ColumnSequence implements Sequence {
    private final long mN;
    private long mR = 0;

    private ColumnSequence(final long n) {
      mN = n;
    }

    @Override
    public Z next() {
      return ++mR <= 1 ? Z.ZERO : mP.get(mN, mR);
    }
  }

  // Using column labels of Kreweras
  @Override
  protected Z[] compute(final int n) {
    LookaheadSequence seq = new LookaheadSequence(new ColumnSequence(n));
    final ArrayList<Z> values = new ArrayList<>();
    for (long k = 0; k <= n; ++k) {
      values.add(seq.peek());
      seq = new LookaheadSequence(DifferenceSequence.create(seq));
    }
    // ans is values u_0^n, u_1^n, ..., u_n^n
    final Z[] ans = new Z[values.size()];
    Z a = Z.ZERO;
    for (int k = n; k >= 0; --k) {
      a = values.get(k).subtract(a);
      ans[k] = a;
    }
    //System.out.println("Col: " + n + " -> " + Arrays.toString(ans));
    return ans;
  }

  protected Z u(final int n, final int r) {
    if (r > n) {
      return Z.ZERO;
    }
    return get(n)[r];
  }

  private int mR = 1;
  private int mN = 1;

  @Override
  public Z next() {
    if (++mR > mN) {
      ++mN;
      mR = 2;
    }
    return u(mN, mR);
  }
}

