package irvine.oeis.a078;

import java.util.HashSet;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A078970 Cycle of the inventory sequence (as in A063850) starting with n consists of prime numbers.
 * @author Sean A. Irvine
 */
public class A078970 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      Z t = Z.valueOf(++mN);
      final HashSet<Z> seen = new HashSet<>();
      while (seen.add(t)) {
        t = Functions.INVENTORY.z(t);
      }
      final Z u = t;
      boolean prime = true;
      do {
        if (!t.isProbablePrime()) {
          prime = false;
          break;
        }
        t = Functions.INVENTORY.z(t);
      } while (!t.equals(u));
      if (prime) {
        return Z.valueOf(mN);
      }
    }
  }
}

