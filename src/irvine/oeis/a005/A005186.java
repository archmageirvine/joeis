package irvine.oeis.a005;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005186 <code>a(n) =</code> number of m which take n steps to reach 1 in <code>'3x+1'</code> problem.
 * @author Sean A. Irvine
 */
public class A005186 implements Sequence {

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
        if (Z.ONE.equals(qr[1]) && !qr[0].isEven() && qr[0].compareTo(Z.ONE) > 0) {
          s.add(qr[0]);
        }
      }
      mS = s;
    }
    return Z.valueOf(mS.size());
  }
}
