package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.a391.A391487;

/**
 * A007803 Number of connected series-parallel graphs with a longest path of at most n edges and also a largest cut set of at most n edges.
 * @author Gregory Morse
 */
public class A007803 extends A391487 {
  @Override
  public Z next() {
    return super.next().multiply2().subtract(1);
  }
}
