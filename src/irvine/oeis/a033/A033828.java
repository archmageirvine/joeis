package irvine.oeis.a033;

import java.util.Collection;
import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.FiniteSequence;

/**
 * A033828 Numbers that can be expressed as the product of two 2-digit numbers in at least one way.
 * @author Sean A. Irvine
 */
public class A033828 extends FiniteSequence {

  private static Collection<Z> build() {
    final TreeSet<Z> res = new TreeSet<>();
    for (int k = 10; k < 100; ++k) {
      for (int j = k; j < 100; ++j) {
        res.add(Z.valueOf(k * j));
      }
    }
    return res;
  }

  /** Construct the sequence. */
  public A033828() {
    super(1, FINITE, build());
  }

}
