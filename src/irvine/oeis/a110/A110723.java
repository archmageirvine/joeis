package irvine.oeis.a110;

import irvine.math.z.Z;

/**
 * A110723 a(n) = A110722(n)/121.
 * @author Georg Fischer
 */
public class A110723 extends A110722 {

  @Override
  public Z next() {
    return super.next().divide(121);
  }
}
