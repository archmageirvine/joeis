package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.a155.A155934;

/**
 * A003509 Let k(m) denote the least integer such that every m X m <code>(0</code>,1)-matrix with exactly k(m) ones in each row and in each column contains <code>a 2</code> X 2 submatrix without zeros. The sequence gives the index n of the first term in each string of equal entries in the {k(m)} sequence (see A155934).
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

