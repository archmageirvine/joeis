package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.a003.A003509;

/**
 * A005991 a(n) is the index of the last occurrence of the n-th distinct term (equal to n+1) in sequence A155934(m) = k(m) = the least integer such that every m X m (0,1)-matrix with exactly k(m) ones in each row and in each column contains a 2 X 2 submatrix without zeros.
 * @author Sean A. Irvine
 */
public class A005991 extends A003509 {

  {
    setOffset(1);
    super.next();
  }

  @Override
  public Z next() {
    return super.next().subtract(1);
  }
}
