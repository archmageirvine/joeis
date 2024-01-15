package irvine.oeis.a067;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a056.A056525;

/**
 * A067899 Fractal palindromic primes of second order.
 * @author Sean A. Irvine
 */
public class A067899 extends Sequence1 {

  private final Sequence mP = new A056525().skip(9);
  private final TreeSet<Z> mA = new TreeSet<>();

  @Override
  public Z next() {
    while (mA.isEmpty()) {
      final Z u = mP.next();
      if (u.isProbablePrime()) {
        final String t = u.toString();
        if (new Z(t.substring(0, t.length() / 2)).isProbablePrime()) {
          for (char center = '0'; center <= '9'; ++center) {
            final Z c = new Z(t + center + t);
            if (c.isProbablePrime()) {
              mA.add(c);
            }
          }
        }
      }
    }
    return mA.pollFirst();
  }
}
