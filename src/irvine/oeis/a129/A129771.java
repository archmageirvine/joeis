package irvine.oeis.a129;
// manually

import irvine.math.z.Z;
import irvine.oeis.a000.A000069;

/**
 * A129771 Evil odd numbers.
 * @author Georg Fischer
 */
public class A129771 extends A000069 {

  @Override
  public Z next() {
    return super.next().multiply(2).add(1);
  }
}
