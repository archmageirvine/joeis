package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007931 Numbers that contain only <code>1</code>'s and <code>2</code>'s. Nonempty binary strings of length n in lexicographic order.
 * @author Sean A. Irvine
 */
public class A007931 implements Sequence {

  private long mN = 1;

  @Override
  public Z next() {
    return new Z(Long.toBinaryString(++mN).substring(1).replace('1', '2').replace('0', '1'));
  }
}
