package irvine.oeis.a068;

import irvine.math.z.Z;

/**
 * A068224 Bit-masks of A068222 shown in binary.
 * @author Sean A. Irvine
 */
public class A068224 extends A068222 {

  @Override
  public Z next() {
    return new Z(super.next().toString(2));
  }
}

