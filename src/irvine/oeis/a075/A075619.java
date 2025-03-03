package irvine.oeis.a075;

import java.util.LinkedList;

import irvine.math.z.Z;

/**
 * A075619 Concatenation of n numbers mentioned in A075618, divided by n.
 * @author Sean A. Irvine
 */
public class A075619 extends A075618 {

  private final LinkedList<Z> mA = new LinkedList<>();
  private long mN = 0;

  @Override
  public Z next() {
    if (!mA.isEmpty()) {
      mA.remove(0);
      mA.add(super.next());
    }
    mA.add(super.next());
    final StringBuilder sb = new StringBuilder();
    for (final Z t : mA) {
      sb.append(t);
    }
    return new Z(sb).divide(++mN);
  }
}
