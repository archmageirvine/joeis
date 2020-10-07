package irvine.oeis.a035;

import java.util.ArrayList;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.DecimalExpansionSequence;
import irvine.oeis.Sequence;
import irvine.oeis.a007.A007732;

/**
 * A035335 a(n) = smallest number m such that n appears in decimal expansion of 1/m.
 * @author Sean A. Irvine
 */
public class A035335 extends A007732 {

  // Heuristic a(n) <= n + 50.

  private static final long LOOKAHEAD = 50;
  private static final int MIN_EXPANSION = 20;
  private int mN = 0;
  private final ArrayList<StringBuilder> mExpansions = new ArrayList<>();
  {
    super.next(); // skip 1
    mExpansions.add(null);
    mExpansions.add(null);
    for (int k = 2; k <= LOOKAHEAD; ++k) {
      final Sequence seq = getSequence(k);
      final StringBuilder sb = new StringBuilder();
      mExpansions.add(sb);
      final int h = getNextPeriod();
      for (int j = 0; j < h; ++j) {
        sb.append(seq.next());
      }
    }
  }

  private int getNextPeriod() {
    // Expand a liberal amount of digits based on the period of 1/n
    return MIN_EXPANSION +  super.next().multiply2().intValueExact();
  }

  private static DecimalExpansionSequence getSequence(final long k) {
    return new DecimalExpansionSequence() {
      private final CR N = CR.valueOf(new Q(1, k));

      @Override
      protected CR getCR() {
        return N;
      }
    };
  }

  @Override
  public Z next() {
    // Start expansion of 1/(n+50)
    final Sequence seq = getSequence(++mN + LOOKAHEAD);
    final StringBuilder sb = new StringBuilder();
    final int h = getNextPeriod();
    for (int j = 0; j < h; ++j) {
      sb.append(seq.next());
    }
    //System.out.println("Expanding " + (mN + LOOKAHEAD) + " to " + h + " digits: " + sb);
    mExpansions.add(sb);

    final String sn = String.valueOf(mN);
    for (int k = 2; k < mExpansions.size(); ++k) {
      if (mExpansions.get(k).indexOf(sn) >= 0) {
        return Z.valueOf(k);
      }
    }
    // Failed to find it, expand all sequences by one more symbol
    throw new UnsupportedOperationException("Heuristics failed");
  }
}

