package irvine.oeis.a069;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069098.
 * @author Sean A. Irvine
 */
public class A069105 extends Sequence1 {

  private final TreeSet<Z> mA = new TreeSet<>();
  {
    mA.add(Z.valueOf(27));
    mA.add(Z.valueOf(37));
    mA.add(Z.valueOf(111));
    mA.add(Z.valueOf(333));
    mA.add(Z.valueOf(999));
  }

  @Override
  public Z next() {
    final Z res = mA.pollFirst();
    mA.add(res.multiply2());
    mA.add(res.multiply(5));
    return res;
  }
}

