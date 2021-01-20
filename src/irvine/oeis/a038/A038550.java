package irvine.oeis.a038;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A038550 Products of an odd prime and a power of two (sorted).
 * @author Sean A. Irvine
 */
public class A038550 extends A000040 {

  {
    super.next(); // skip 2
  }
  private final TreeSet<Z> mS = new TreeSet<>();
  private Z mP = super.next();

  @Override
  public Z next() {
    while (mS.isEmpty() || mP.compareTo(mS.first()) < 0) {
      mS.add(mP);
      mP = super.next();
    }
    final Z t = mS.pollFirst();
    mS.add(t.multiply2());
    return t;
  }
}
