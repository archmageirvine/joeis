package irvine.oeis.a033;

import java.util.Collection;
import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.FiniteSequence;

/**
 * A033830 Numbers that can be expressed as the product of three 2-digit numbers.
 * @author Sean A. Irvine
 */
public class A033830 extends FiniteSequence {

  private static Collection<Z> build() {
    final TreeSet<Z> res = new TreeSet<>();
    for (int k = 10; k < 100; ++k) {
      for (int j = k; j < 100; ++j) {
        for (int i = j; i < 100; ++i) {
          res.add(Z.valueOf(k * j * i));
        }
      }
    }
    return res;
  }

  /** Construct the sequence. */
  public A033830() {
    super(build());
  }

}
