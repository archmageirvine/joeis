package irvine.oeis.a069;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069858 1/n has period 4 in base 10.
 * @author Sean A. Irvine
 */
public class A069858 extends Sequence1 {

  private final TreeSet<Z> mA = new TreeSet<>();
  {
    mA.add(Z.valueOf(101));
    mA.add(Z.valueOf(303));
    mA.add(Z.valueOf(909));
    mA.add(Z.valueOf(1111));
    mA.add(Z.valueOf(3333));
    mA.add(Z.valueOf(9999));
  }

  @Override
  public Z next() {
    final Z res = mA.pollFirst();
    mA.add(res.multiply2());
    mA.add(res.multiply(5));
    return res;
  }
}

