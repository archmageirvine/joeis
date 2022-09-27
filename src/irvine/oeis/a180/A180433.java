package irvine.oeis.a180;

import irvine.math.z.Z;
import irvine.oeis.a004.A004601;

/**
 * A180433 Binary string formed from the binary expansion of Pi by exchanging 0's and 1's.
 * @author Georg Fischer
 */
public class A180433 extends A004601 {

  @Override
  public int getOffset() {
    return 1;
  }

  @Override
  public Z next() {
    return Z.ONE.subtract(super.next());
  }
}
