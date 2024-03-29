package irvine.oeis.a038;

import irvine.math.z.Z;

/**
 * A038645 Gaps of 3 in sequence A038593 (lower terms).
 * @author Sean A. Irvine
 */
public class A038645 extends A038593 {

  private Z mA = super.next();

  @Override
  public Z next() {
    while (true) {
      final Z t = mA;
      mA = super.next();
      if (t.add(3).equals(mA)) {
        return t;
      }
    }
  }
}
