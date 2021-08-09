package irvine.oeis.a050;

import irvine.math.z.Z;
import irvine.oeis.a051.A051168;

/**
 * A050184 T(2n+6,n), array T as in A051168; a count of Lyndon words.
 * @author Sean A. Irvine
 */
public class A050184 extends A051168 {

  private long mN = -1;

  @Override
  public Z next() {
    return t(2 * ++mN + 6, mN);
  }
}
