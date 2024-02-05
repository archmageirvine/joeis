package irvine.oeis.a068;

import irvine.math.z.Z;

/**
 * A068223 Bit-masks of A068221 shown in binary.
 * @author Sean A. Irvine
 */
public class A068223 extends A068221 {

  @Override
  public Z next() {
    return new Z(super.next().toString(2));
  }
}

