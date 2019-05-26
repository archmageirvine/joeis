package irvine.oeis.a023;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A023107 Largest integer in which every prefix is prime in base <code>n</code> (written in base <code>10)</code>.
 * @author Sean A. Irvine
 */
public class A023107 implements Sequence {

  private int mBase = 2;

  @Override
  public Z next() {
    // Keep expanding all possibilities until nothing longer can be made,
    // then return the largest of the previous length
    ++mBase;
    TreeSet<Z> prevCandidates = null;
    TreeSet<Z> candidates = new TreeSet<>();
    candidates.add(Z.ZERO);
    while (!candidates.isEmpty()) {
      prevCandidates = candidates;
      candidates = new TreeSet<>();
      for (final Z p : prevCandidates) {
        final Z sp = p.multiply(mBase);
        for (int k = 1; k < mBase; ++k) {
          final Z t = sp.add(k);
          if (t.isProbablePrime()) {
            candidates.add(t);
          }
        }
      }
    }
    return prevCandidates.pollLast();
  }
}
