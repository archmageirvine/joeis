package irvine.oeis.a068;

import java.util.HashSet;
import java.util.Set;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068520.
 * @author Sean A. Irvine
 */
public class A068520 extends Sequence1 {

  private long mN = 10;

  private Set<Q> buildSet(final String digits) {
    final HashSet<Q> res = new HashSet<>();
    res.add(new Q(digits));
    for (int pivot = 1; pivot < digits.length(); ++pivot) {
      for (final Q left : buildSet(digits.substring(0, pivot))) {
        for (final Q right : buildSet(digits.substring(pivot))) {
          res.add(left.add(right));
          res.add(left.subtract(right));
          res.add(left.multiply(right));
          if (!right.isZero()) {
            res.add(left.divide(right));
          }
        }
      }
    }
    return res;
  }

  @Override
  public Z next() {
    while (true) {
      final String digits = String.valueOf(++mN);
      for (int equals = 1; equals < digits.length(); ++equals) {
        final Q target = new Q(digits.substring(equals));
        if (buildSet(digits.substring(0, equals)).contains(target)) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}

