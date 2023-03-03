package irvine.oeis.a068;
// manually knestm/knest at 2023-03-02 15:17

import irvine.math.z.Z;
import irvine.oeis.a060.A060072;

/**
 * A068792 a(n) = (n-1)*n^(n-2) + Sum_{i=1..n} (n-i)*(n^(n-i-1) + n^(n+i-3)).
 * @author Georg Fischer
 */
public class A068792 extends A060072 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().square();
  }
}
