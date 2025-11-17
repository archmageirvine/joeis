package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.a155.A155934;

/**
 * A003509 a(n) is the index of the first occurrence of n in A155934(m) = k(m) = the least integer such that every m X m (0,1)-matrix with exactly k(m) ones in each row and in each column contains a 2 X 2 submatrix without zeros.
 * @author Sean A. Irvine
 */
public class A003509 extends A155934 {

  private Z mA = Z.ONE;
  private long mN = 1;

  @Override
  public Z next() {
    Z t;
    do {
      ++mN;
      t = super.next();
    } while  (t.compareTo(mA) <= 0);
    mA = t;
    return Z.valueOf(mN);
  }
}

