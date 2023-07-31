package irvine.oeis.a204;

import irvine.math.z.Z;

/**
 * A204990 (1/2)*(A204991).
 * @author Georg Fischer
 */
public class A204990 extends A204991 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}
