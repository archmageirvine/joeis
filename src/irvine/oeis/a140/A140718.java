package irvine.oeis.a140;

import java.util.ArrayList;
import java.util.List;

import irvine.math.z.Z;
import irvine.oeis.FiniteSequence;

/**
 * A140718 This is the beginning of a Prime Chain of 224 terms consisting of the output of 2x^2 +29 repeated four times, alternating with these same terms in reverse within a procedural expression of a single polynomial.
 * @author Sean A. Irvine
 */
public class A140718 extends FiniteSequence {

  private static List<Z> build() {
    final ArrayList<Z> res = new ArrayList<>();
    for (long k = 1; k < 29; ++k) {
      final Z t = Z.valueOf(2 * k * k + 29);
      res.add(t);
      res.add(t);
      res.add(t);
      res.add(t);
      final Z u = Z.valueOf(2 * (29 - k) * (29 - k) + 29);
      res.add(u);
      res.add(u);
      res.add(u);
      res.add(u);
    }
    return res;
  }

  /** Construct the sequence. */
  public A140718() {
    super(1, FINITE, build());
  }
}
