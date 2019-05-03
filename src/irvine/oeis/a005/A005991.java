package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.a003.A003509;

/**
 * A005991 Let <code>k(m)</code> denote the least integer such that every m X m <code>(0,1)-matrix</code> with exactly <code>k(m)</code> ones in each row and in each column contains a <code>2 X 2</code> submatrix without zeros. The sequence gives the index n of the last term in each string of equal entries in the <code>{k(m)}</code> sequence (see <code>A155934)</code>.
 * @author Sean A. Irvine
 */
public class A005991 extends A003509 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().subtract(1);
  }
}
