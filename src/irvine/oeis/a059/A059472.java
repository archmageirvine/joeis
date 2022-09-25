package irvine.oeis.a059;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000040;

/**
 * A059472 Primes omitted from A059471.
 * @author Sean A. Irvine
 */
public class A059472 extends A000040 {

  // Note primes in A059471 are not strictly ordered!

  private final HashSet<Z> mExcluded = new HashSet<>();

  @Override
  public Z next() {
    if (mExcluded.isEmpty()) {
      final Sequence seq = new A059471();
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
