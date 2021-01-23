package irvine.oeis.a032;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A032450 Period of finite sequence g(n) related to Poulet's Conjecture.
 * @author Sean A. Irvine
 */
public class A032450 implements Sequence {

  private long mN = 0;
  private List<Z> mNextTerms = Collections.emptyList();
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM < mNextTerms.size()) {
      // Return a term from previous "mN"
      return mNextTerms.get(mM);
    }
    if (++mN == 1) {
      return Z.ONE; // special case (only sequence of period 1)
    }
    final ArrayList<Z> g = new ArrayList<>();
    g.add(Z.valueOf(mN));
    while (true) {
      final FactorSequence fs = Cheetah.factor(g.get(g.size() - 1));
      final Z t = (g.size() & 1) == 1 ? fs.sigma() : fs.phi();
      // Check for a cycle
      for (int k = 2 - (g.size() & 1); k < g.size(); k += 2) {
        if (t.equals(g.get(k))) {
          // Found a cycle
          mNextTerms = g;
          mM = k;
          //System.out.println(g);
          return mNextTerms.get(mM);
        }
      }
      g.add(t);
    }
  }
}
