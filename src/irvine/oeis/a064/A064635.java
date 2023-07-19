package irvine.oeis.a064;

import irvine.math.z.Z;

/**
 * A064635 Even numbers not appearing in A064466. a(n) = A064466(A064634(n)) + 2 for n &gt; 0.
 * @author Sean A. Irvine
 */
public class A064635 extends A064466 {

  private Z mA = super.next();

  @Override
  public Z next() {
    while (true) {
      final Z t = mA;
      mA = super.next();
      if (mA.subtract(t).compareTo(Z.TWO) > 0) {
        return t.add(2);
      }
    }
  }
}
