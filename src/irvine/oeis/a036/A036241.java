package irvine.oeis.a036;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A036241 a(1)=1, a(2)=2, a(3)=3; for n &gt;= 3, a(n) is smallest number such that all a(i) for 1 &lt;= i &lt;= n are distinct, all a(i)+a(j) for 1 &lt;= i &lt; j &lt;= n are distinct and all a(i)+a(j)+a(k) for 1 &lt;= i &lt; j &lt; k &lt;= n are distinct.
 * @author Sean A. Irvine
 */
public class A036241 extends Sequence1 {

  private final TreeSet<Z> mA1 = new TreeSet<>();
  private final TreeSet<Z> mA2 = new TreeSet<>();
  private final TreeSet<Z> mA3 = new TreeSet<>();

  @Override
  public Z next() {
    if (mA1.isEmpty()) {
      mA1.add(Z.ONE);
      return Z.ONE;
    }
    if (mA2.isEmpty()) {
      mA1.add(Z.TWO);
      mA2.add(Z.THREE); // 1 + 2
      return Z.TWO;
    }
    if (mA3.isEmpty()) {
      mA1.add(Z.THREE);
      mA2.add(Z.FOUR);  // 1 + 3
      mA2.add(Z.FIVE);  // 2 + 3
      mA3.add(Z.SIX);   // 1 + 2 + 3
      return Z.THREE;
    }
    Z n = mA1.last();
    outer:
    while (true) {
      n = n.add(1);
      final TreeSet<Z> seen2 = new TreeSet<>();
      for (final Z t : mA1) {
        final Z u = t.add(n);
        if (mA2.contains(u)) {
          continue outer;
        }
        seen2.add(u);
      }
      final TreeSet<Z> seen3 = new TreeSet<>();
      for (final Z t : mA2) {
        final Z u = t.add(n);
        if (mA3.contains(u)) {
          continue outer;
        }
        seen3.add(u);
      }
      // n is the result, add to sets
      mA1.add(n);
      mA2.addAll(seen2);
      mA3.addAll(seen3);
      return n;
    }
  }
}

