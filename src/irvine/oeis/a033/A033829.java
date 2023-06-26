package irvine.oeis.a033;

import java.util.Collection;
import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.FiniteSequence;

/**
 * A033829 Numbers that can be expressed as the product of two 3-digit numbers in at least one way.
 * @author Sean A. Irvine
 */
public class A033829 extends FiniteSequence {

  private static Collection<Z> build() {
    final TreeSet<Z> res = new TreeSet<>();
    for (int k = 100; k < 1000; ++k) {
      for (int j = k; j < 1000; ++j) {
        res.add(Z.valueOf(k * j));
      }
    }
    return res;
  }

  /** Construct the sequence. */
  public A033829() {
    super(1, FINITE, build());
  }

}
