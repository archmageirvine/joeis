package irvine.oeis.a033;

import irvine.math.z.Z;

/**
 * A033956 Add prime(n) to A033955.
 * @author Sean A. Irvine
 */
public class A033956 extends A033955 {

  @Override
  public Z next() {
    return super.next().add(mP);
  }
}
