package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.a047.A047874;

import java.util.ArrayList;

/**
 * A001457.
 * @author Sean A. Irvine
 */
public class A001457 extends A047874 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    final ArrayList<Integer> l = new ArrayList<>();
    l.add(6);
    return g(mN, Math.min(mN, 6), l);
  }
}
