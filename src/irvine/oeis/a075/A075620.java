package irvine.oeis.a075;

import java.util.LinkedList;

import irvine.math.z.Z;

/**
 * A075616.
 * @author Sean A. Irvine
 */
public class A075620 extends A075616 {

  private final LinkedList<Z> mA = new LinkedList<>();

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
    final Z p = new Z(sb);
    assert p.isProbablePrime();
    return p;
  }
}
