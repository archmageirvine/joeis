package irvine.oeis.a387;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A387269.
 * @author Sean A. Irvine
 */
public class A387269 extends Sequence1 {

  private final TreeSet<Z> mA = new TreeSet<>();
  {
    mA.add(Z.FOUR);
  }

  @Override
  public Z next() {
    final Z res = mA.pollFirst();
    mA.add(res.shiftLeft(3).add(Z.FOUR)); // Add new 100 to end
    final Z t = res.makeOdd();
    final long m = t.auxiliary(); // Length of trailing 0s
    mA.add(t.multiply2().add(1).shiftLeft(m + 1)); // Lengthen last run by one 1 and one 0
    return res;
  }
}

