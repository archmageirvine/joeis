package irvine.oeis.a022;

import java.util.ArrayList;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;
import irvine.oeis.MemorySequence;
import irvine.oeis.Sequence;

/**
 * A022159 First row of spectral array <code>W(sqrt(3))</code>.
 * @author Sean A. Irvine
 */
public class A022159 extends MemorySequence {

  private static final CR SQRT3 = CR.THREE.sqrt();

  protected CR h() {
    return SQRT3;
  }

  private final ComplementSequence mB = new ComplementSequence(new Sequence() {
    private long mN = 0;
    @Override
    public Z next() {
      return h().multiply(++mN).floor();
    }
  }, Z.ONE);

  private final ArrayList<Z> mBTerms = new ArrayList<>();

  private Z aa(final int n) {
    return h().multiply(n).floor();
  }

  private Z b(final int n) {
    while (mBTerms.size() < n) {
      mBTerms.add(mB.next());
    }
    return mBTerms.get(n - 1);
  }

  @Override
  protected Z computeNext() {
    final int j = size();
    if (j <= 1) {
      return j == 0 ? aa(1).square() : b(aa(1).intValueExact());
    }
    if ((j & 1) == 1) {
      return b(get(j - 2).intValueExact());
    } else {
      return aa(get(j - 1).intValueExact());
    }
  }
}
