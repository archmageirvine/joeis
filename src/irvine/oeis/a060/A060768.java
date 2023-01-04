package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A060768 Pseudo-Kaprekar triples: q such that if q=x+y+z, then q^3=x*10^i + y*10^j + z, where (y*10^j+z &lt; 10^i) and z &lt; 10^j.
 * @author Sean A. Irvine
 */
public class A060768 extends Sequence1 {

  private long mN = 0;

  private boolean is(final Z n, final Z n3) {
    for (Z j = Z.TEN; j.compareTo(n3) < 0; j = j.multiply(10)) {
      final Z[] qrj = n3.divideAndRemainder(j);
      for (Z i = Z.TEN; i.compareTo(qrj[0]) < 0; i = i.multiply(10)) {
        final Z[] qri = qrj[0].divideAndRemainder(i);
        if (qrj[1].add(qri[1]).add(qri[0]).equals(n)) {
          return true;
        }
      }
    }
    return false;
  }

  @Override
  public Z next() {
    while (true) {
      if (++mN == 1) {
        return Z.ONE;
      }
      final Z n = Z.valueOf(mN);
      final Z n3 = n.pow(3);
      if (is(n, n3)) {
        return n;
      }
    }
  }
}
