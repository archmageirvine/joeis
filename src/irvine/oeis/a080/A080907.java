package irvine.oeis.a080;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.AliquotSequence;
import irvine.oeis.Sequence1;

/**
 * A080907 Numbers whose aliquot sequence terminates in a 1.
 * @author Sean A. Irvine
 */
public class A080907 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final AliquotSequence as = new AliquotSequence(++mN);
      final HashSet<Z> seen = new HashSet<>();
      while (true) {
        final Z t = as.next();
        if (t.isOne()) {
          return Z.valueOf(mN);
        }
        if (!seen.add(t)) {
          break;
        }
      }
    }
  }
}

