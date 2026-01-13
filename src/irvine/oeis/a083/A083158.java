package irvine.oeis.a083;

import java.util.TreeSet;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a002.A002113;

/**
 * A083158 Palindromes which are the arithmetic mean of two distinct palindromes.
 * @author Sean A. Irvine
 */
public class A083158 extends Sequence1 {

  private final TreeSet<Z> mA = new TreeSet<>();
  private final Sequence mS = new A002113().skip();
  private Z mP = mS.next();

  @Override
  public Z next() {
    while (mA.isEmpty() || mA.first().multiply2().compareTo(mP) > 0) {
      final Sequence t = new A002113().skip();
      Z u;
      while (!(u = t.next()).equals(mP)) {
        if (u.isEven() == mP.isEven()) {
          final Z r = mP.add(u).divide2();
          if (Predicates.PALINDROME.is(r)) {
            mA.add(r);
          }
        }
      }
      mP = mS.next();
    }
    return mA.pollFirst();
  }
}

