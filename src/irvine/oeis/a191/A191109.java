package irvine.oeis.a191;
// manually a190803 at 2021-09-02 12:32

import irvine.math.z.Z;
import irvine.oeis.a190.A190803;

/**
 * A191109 a(1)=1, and if x is a term then 3x-1 and 3x+2 are terms too..
 * @author Georg Fischer
 */
public class A191109 extends A190803 {

  @Override
  public void insertTerms(final Z x) {
    insert(x.multiply(3).subtract(Z.ONE));
    insert(x.multiply(3).add(Z.TWO));
  }

}
