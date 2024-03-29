package irvine.oeis.a351;
// Generated by gen_seq4.pl knestm/knest at 2023-03-02 20:40

import irvine.math.z.Z;
import irvine.oeis.a007.A007655;

/**
 * A351683 Squares that are also 4-dimensional pyramidal numbers.
 * @author Georg Fischer
 */
public class A351683 extends A007655 {
  @Override
  public Z next() {
    return super.next().square();
  }
}
