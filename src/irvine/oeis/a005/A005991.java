package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.a003.A003509;

/**
 * A005991 Let k(m) denote the least integer such that every m X m (0,1)-matrix with exactly k(m) ones in each row and in each column contains a 2 X 2 submatrix without zeros. The sequence gives the index n of the last term in each string of equal entries in the {k(m)} sequence (see A155934).
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
