package irvine.oeis.a036;

import irvine.math.z.Z;

/**
 * A036285 Sequence A036284 written in octal.
 * @author Sean A. Irvine
 */
public class A036285 extends A036284 {

  @Override
  public Z next() {
    return new Z(super.next().toString(8));
  }
}

