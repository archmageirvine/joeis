package irvine.oeis.a066;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Conjectural;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.base.RaddSequence;

/**
 * A066056 Number of 'Reverse and Add!' operations that have to be applied to the n-th term of A066055 in order to obtain a term in the trajectory of 10583.
 * @author Sean A. Irvine
 */
public class A066056 extends Sequence0 implements Conjectural {

  private static final int HEURISITC_STEPS = 100;
  private final Sequence mA66054 = new A066054();
  private final TreeSet<Z> mA = new TreeSet<>();

  {
    mA.add(mA66054.next()); // prevent need for isEmpty checking
  }

  private long mN = 11572;

  @Override
  public Z next() {
    while (true) {
      final RaddSequence s = new RaddSequence(1, 10, ++mN);
      long k = 0;
      while (true) {
        final Z m = s.next();
        while (m.compareTo(mA.last()) > 0) {
          mA.add(mA66054.next());
        }
        if (mA.contains(m)) {
          return Z.valueOf(k);
        }
        if (++k >= HEURISITC_STEPS || ZUtils.isPalindrome(m, 10)) {
          break;
        }
      }
    }
  }
}
