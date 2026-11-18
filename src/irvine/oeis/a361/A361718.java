package irvine.oeis.a361;

import irvine.math.z.Z;
import irvine.oeis.a058.A058876;
import irvine.oeis.triangle.Triangle;

/**
 * A361718 Triangular array read by rows. T(n,k) is the number of labeled directed acyclic graphs on [n] with exactly k nodes of indegree 0.
 * @author Gregory Morse
 */
public class A361718 extends Triangle {
  private final A058876 mDags = new A058876();

  @Override
  protected Z compute(final int n, final int k) {
    return k == 0 ? (n == 0 ? Z.ONE : Z.ZERO) : mDags.get(n, k);
  }
}
