package irvine.oeis.a014;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.a001.A001223;

/**
 * A014320 The next new gap between successive primes.
 * @author Sean A. Irvine
 */
public class A014320 extends A001223 {

  private final TreeSet<Z> mSeen = new TreeSet<>();

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (mSeen.add(t)) {
        return t;
      }
    }
  }
}

