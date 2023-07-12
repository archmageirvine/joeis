package irvine.oeis.a147;

import irvine.math.z.Z;
import irvine.oeis.a046.A046162;

/**
 * A147560 a(n) = 4*A046162(n+1).
 * @author Georg Fischer
 */
public class A147560 extends A046162 {

  {
    setOffset(0);
  }

  @Override
  public Z next() {
    return super.next().multiply(4);
  }
}
