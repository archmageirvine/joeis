package irvine.oeis.a075;
// manually dersimple at 2021-08-25 11:05

import irvine.math.z.Z;
import irvine.oeis.a060.A060432;

/**
 * A075349 a(1) = 1; first differences follow the pattern 1,2,2,3,3,3,4,4,4,4,5,5,5,5,5,..., i.e., the next n differences are n.
 * @author Georg Fischer
 */
public class A075349 extends A060432 {

  private int mN = 0;
  
  @Override
  public Z next() {
    ++mN;
    return mN <= 1 ? Z.ONE : super.next().add(1);
  }
}
