package irvine.oeis.a350;

import irvine.math.z.Z;
import irvine.oeis.a003.A003030;

/**
 * A350790 Number of digraphs on n labeled nodes with a global source and sink.
 * @author Gregory Morse
 */
public class A350790 extends A003030 {

  private int mN = 0;

  @Override
  public Z next() {
    // Identify the two endpoints and allow a loop on the resulting marked vertex.
    return ++mN <= 2 ? Z.valueOf(mN) : s(mN - 1).multiply((long) mN * (mN - 1)).multiply2();
  }
}
