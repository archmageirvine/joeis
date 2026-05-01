package irvine.oeis.a084;

import java.util.TreeSet;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a001.A001567;

/**
 * A084653 Fermat base-2 pseudoprimes whose prime factors do not divide any smaller pseudoprime.
 * @author Sean A. Irvine
 */
public class A084653 extends A001567 {

  private final TreeSet<Z> mForbidden = new TreeSet<>();

  @Override
  public Z next() {
    while (true) {
      final Z pp = super.next();
      boolean ok = true;
      for (final Z p : Jaguar.factor(pp).toZArray()) {
        if (!mForbidden.add(p)) {
          ok = false;
        }
      }
      if (ok) {
        return pp;
      }
    }
  }
}
