package irvine.oeis.a032;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

import irvine.math.z.Z;
import irvine.oeis.AliquotSequence;
import irvine.oeis.Sequence;

/**
 * A032451 Irregular triangle read by rows: there is a row for each value of n for which the aliquot sequence starting at n eventually reaches 1, giving the part of the sequence from n to 1.
 * @author Sean A. Irvine
 */
public class A032451 implements Sequence {

  private long mN = 0;
  private List<Z> mNextTerms = Collections.emptyList();
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM < mNextTerms.size()) {
      // Return a term from previous "mN"
      return mNextTerms.get(mM);
    }
    while (true) {
      final AliquotSequence seq = new AliquotSequence(++mN);
      final ArrayList<Z> terms = new ArrayList<>();
      final HashSet<Z> seen = new HashSet<>(); // for cycle detection
      while (true) {
        final Z t = seq.next();
        if (!seen.add(t)) {
          break; // we are going to skip this value of mN
        }
        terms.add(t);
        if (Z.ONE.equals(t)) {
          mNextTerms = terms;
          mM = 0;
          return mNextTerms.get(0);
        }
      }
    }
  }
}
