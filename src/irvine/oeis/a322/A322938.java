package irvine.oeis.a322;
// manually dersimple at 2022-12-15 22:48

import irvine.math.z.Z;
import irvine.oeis.a001.A001791;

/**
 * A322938 a(n) = binomial(2*n + 2, n + 2) - 1.
 * @author Georg Fischer
 */
public class A322938 extends A001791 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().subtract(1);
  }
}
