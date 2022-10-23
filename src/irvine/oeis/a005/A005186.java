package irvine.oeis.a005;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A005186 a(n) is the number of integers m which take n steps to reach 1 in '3x+1' problem.
 * @author Sean A. Irvine
 */
public class A005186 extends Sequence0 {

  // After T. D. Noe

  private HashSet<Z> mS = new HashSet<>();

  @Override
  public Z next() {
    if (mS.isEmpty()) {
      mS.add(Z.ONE);
    } else {
      final HashSet<Z> s = new HashSet<>(mS.size() * 2);
      for (final Z v : mS) {
        s.add(v.multiply2());
        final Z[] qr = v.divideAndRemainder(Z.THREE);
        if (Z.ONE.equals(qr[1]) && qr[0].isOdd() && qr[0].compareTo(Z.ONE) > 0) {
          s.add(qr[0]);
        }
      }
      mS = s;
    }
    return Z.valueOf(mS.size());
  }
}
