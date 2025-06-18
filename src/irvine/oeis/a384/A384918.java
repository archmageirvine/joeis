package irvine.oeis.a384;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A384918 allocated for Jules Beauchamp.
 * @author Sean A. Irvine
 */
public class A384918 extends Sequence1 {

  private final TreeSet<Z> mA = new TreeSet<>();
  {
    mA.add(Z.NEG_ONE);
  }

  @Override
  public Z next() {
    final Z t = mA.pollFirst();
    final Z res = t.add(3);
    mA.add(res.multiply2());
    if (t.signum() > 0) {
      mA.add(t.multiply2());
    }
    return res;
  }
}

