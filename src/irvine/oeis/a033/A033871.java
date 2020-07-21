package irvine.oeis.a033;

import java.util.ArrayList;
import java.util.List;

import irvine.factor.factor.PrimeDivision;
import irvine.math.z.Z;
import irvine.oeis.FiniteSequence;

/**
 * A033871 Divisors <code>= 3 (mod 4)</code> of Descartes's 198585576189.
 * @author Sean A. Irvine
 */
public class A033871 extends FiniteSequence {

  private static List<Z> build() {
    final ArrayList<Z> res = new ArrayList<>();
    for (final Z d : new PrimeDivision().factorize(Z.valueOf(198585576189L)).divisorsSorted()) {
      if (d.mod(4) == 3) {
        res.add(d);
      }
    }
    return res;
  }

  /** Construct the sequence. */
  public A033871() {
    super(build());
  }
}
