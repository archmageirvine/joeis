package irvine.oeis.a078;

import java.util.HashSet;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A078786 Period of cycle of the inventory sequence (as in A063850) starting with n.
 * @author Sean A. Irvine
 */
public class A078786 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    Z t = Z.valueOf(++mN);
    final HashSet<Z> seen = new HashSet<>();
    while (seen.add(t)) {
      t = Functions.INVENTORY.z(t);
    }
    final Z u = t;
    long cnt = 0;
    do {
      ++cnt;
      t = Functions.INVENTORY.z(t);
    } while (!t.equals(u));
    return Z.valueOf(cnt);
  }
}

