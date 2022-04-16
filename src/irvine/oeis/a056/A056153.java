package irvine.oeis.a056;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.a025.A025487;

/**
 * A056153 Leading least prime signatures: a(n) is in A025487 but a(n)/2 is not.
 * @author Sean A. Irvine
 */
public class A056153 extends A025487 {

  private final TreeSet<Z> mA = new TreeSet<>();

  @Override
  public Z next() {
    outer:
    while (true) {
      final Z t = super.next();
      mA.add(t);
      final Z u = t.divide2();
      int c;
      while ((c = mA.first().compareTo(u)) <= 0) {
        if (c == 0) {
          continue outer;
        }
        mA.pollFirst(); // no longer needed
      }
      return t;
    }
  }
}

