package irvine.oeis.a036;

import java.util.TreeSet;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000045;

/**
 * A036797 Iccanobif (or iccanobiF) primes: primes which are Fibonacci numbers when reversed.
 * @author Sean A. Irvine
 */
public class A036797 extends A000045 {

  {
    setOffset(1);
  }

  private final TreeSet<Z> mA = new TreeSet<>();

  @Override
  public Z next() {
    while (true) {
      final Z iccanobif = Functions.REVERSE.z(super.next());
      if (iccanobif.isProbablePrime()) {
        if (mA.isEmpty() || mA.first().toString().length() >= iccanobif.toString().length()) {
          mA.add(iccanobif);
        } else {
          mA.add(iccanobif);
          return mA.pollFirst();
        }
      }
    }
  }
}
