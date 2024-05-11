package irvine.oeis.a066;

import java.util.TreeSet;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Conjectural;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.base.RaddSequence;

/**
 * A066055 Integers n &gt; 10583 such that the 'Reverse and Add!' trajectory of n joins the trajectory of 10583.
 * @author Sean A. Irvine
 */
public class A066055 extends Sequence1 implements Conjectural {

  private static final int HEURISITC_STEPS = 100;
  private final Sequence mA66054 = new A066054();
  private final TreeSet<Z> mA = new TreeSet<>();

  {
    setOffset(0);
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
          return Z.valueOf(mN);
        }
        if (++k >= HEURISITC_STEPS || Predicates.PALINDROME.is(10, m)) {
          break;
        }
      }
    }
  }
}
