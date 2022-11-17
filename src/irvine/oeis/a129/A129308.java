package irvine.oeis.a129;

import irvine.math.z.Z;
import irvine.oeis.a195.A195155;

/**
 * A129308 a(n) is the number of positive integers k such that k*(k+1) divides n.
 * @author Georg Fischer
 */
public class A129308 extends A195155 {

  @Override
  public Z next() {
    return super.next().subtract(1);
  }
}
