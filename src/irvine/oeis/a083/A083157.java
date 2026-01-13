package irvine.oeis.a083;

import java.util.TreeSet;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a002.A002113;

/**
 * A083157 Palindromes which are the geometric mean of two distinct palindromes &gt;1.
 * @author Sean A. Irvine
 */
public class A083157 extends Sequence1 {

  private final TreeSet<Z> mA = new TreeSet<>();
  private final Sequence mS = new A002113().skip(2);
  private Z mP = mS.next();

  @Override
  public Z next() {
    while (mA.isEmpty() || mA.first().compareTo(mP.sqrt()) > 0) {
      final Sequence t = new A002113().skip(2);
      Z u;
      while (!(u = t.next()).equals(mP)) {
        final Z prod = mP.multiply(u);
        final Z r = prod.sqrt();
        if (prod.auxiliary() == 1 && Predicates.PALINDROME.is(r)) {
          mA.add(r);
        }
      }
      mP = mS.next();
    }
    return mA.pollFirst();
  }
}

