package irvine.math.group;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * A special implementation for calculating a variation of the Euler totient
 * function for the case of determining if two multiplicative groups are
 * isomorphic.
 * @author Sean A. Irvine
 */
final class ShanksPhi {

  private ShanksPhi() { }

  static List<Z> phi(final Z n) {
    final FactorSequence fs = Cheetah.factor(n);
    if (!fs.isComplete()) {
      throw new UnsupportedOperationException();
    }
    final ArrayList<Z> res = new ArrayList<>();
    for (final Z p : fs.toZArray()) {
      final int e = fs.getExponent(p);
      if (Z.TWO.equals(p)) {
        if (e >= 2) {
          res.add(Z.TWO);
          if (e > 2) {
            res.add(Z.ONE.shiftLeft(e - 2));
          }
        }
      } else {
        if (e > 1) {
          res.add(p.pow(e - 1));
        }
        final FactorSequence fsp = Cheetah.factor(p.subtract(1));
        if (!fsp.isComplete()) {
          throw new UnsupportedOperationException();
        }
        for (final Z q : fsp.toZArray()) {
          res.add(q.pow(fsp.getExponent(q)));
        }
      }
    }
    Collections.sort(res);
    return res;
  }
}
