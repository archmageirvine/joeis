package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007088 The binary numbers (or binary words, or binary vectors): numbers written in base 2.
 * @author Sean A. Irvine
 */
public class A007088 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return new Z(Long.toBinaryString(++mN));
  }
}
