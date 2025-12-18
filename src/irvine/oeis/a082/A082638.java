package irvine.oeis.a082;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.a077.A077388;

/**
 * A082638 A077388 sorted and duplicates removed.
 * @author Sean A. Irvine
 */
public class A082638 extends A077388 {

  private final TreeSet<Z> mA = new TreeSet<>();

  @Override
  public Z next() {
    mA.add(super.next());
    mA.add(super.next());
    return mA.pollFirst();
  }
}
