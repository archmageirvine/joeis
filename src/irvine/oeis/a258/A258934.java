package irvine.oeis.a258;
// manually knestm/knest at 2023-03-02 16:06

import irvine.math.z.Z;
import irvine.oeis.a072.A072473;

/**
 * A258934 Half the difference between the 2n-th prime and the n-th prime, starting from n=2.
 * @author Georg Fischer
 */
public class A258934 extends A072473 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().divide2();
  }
}
