package irvine.oeis.a046;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.a000.A000668;

/**
 * A046528.
 * @author Sean A. Irvine
 */
public class A046528 extends A000668 {

  // Essentially distinct multiplicative closure

  private final TreeSet<Z> mMembers = new TreeSet<>();
  private final TreeSet<Z> mA = new TreeSet<>();
  {
    mMembers.add(Z.ONE);
    mA.add(Z.ONE);
  }
  private Z mP = super.next();

  @Override
  public Z next() {
    while (mA.isEmpty() || mA.first().compareTo(mP) > 0) {
      final TreeSet<Z> newMembers = new TreeSet<>();
      for (final Z t : mMembers) {
        newMembers.add(t.multiply(mP));
      }
      mMembers.addAll(newMembers);
      mA.addAll(newMembers);
      mP = super.next();
    }
    return mA.pollFirst();
  }
}

