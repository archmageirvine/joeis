package irvine.oeis.a277;

import irvine.math.z.Z;

/**
 * A277574 (1/2)*A277570.
 * @author Georg Fischer
 */
public class A277574 extends A277570 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}
