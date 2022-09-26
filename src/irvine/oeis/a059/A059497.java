package irvine.oeis.a059;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000040;

/**
 * A059497 Primes omitted from A059496.
 * @author Sean A. Irvine
 */
public class A059497 extends A000040 {

  private final HashSet<Z> mExcluded = new HashSet<>();

  @Override
  public Z next() {
    if (mExcluded.isEmpty()) {
      final Sequence seq = new A059496();
      Z t;
      while ((t = seq.next()) != null) {
        mExcluded.add(t);
      }
    }
    while (true) {
      final Z p = super.next();
      if (!mExcluded.contains(p)) {
        return p;
      }
    }
  }
}
