package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.a155.A155934;

/**
 * A003509 Let <code>k(m)</code> denote the least integer such that every m X m <code>(0,1)-matrix</code> with exactly <code>k(m)</code> ones in each row and in each column contains a <code>2 X 2</code> submatrix without zeros. The sequence gives the index n of the first term in each string of equal entries in the <code>{k(m)}</code> sequence <code>(see A155934)</code>.
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

