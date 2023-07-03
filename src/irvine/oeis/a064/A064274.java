package irvine.oeis.a064;
// manually inverse at 2022-05-26 19:42

import irvine.math.z.Z;
import irvine.oeis.InverseSequence;
import irvine.oeis.a035.A035513;

/**
 * A064274 Inverse of sequence A035513 considered as a permutation of the nonnegative integers.
 * @author Georg Fischer
 */
public class A064274 extends InverseSequence {

  private int mN = -1;

  /** Construct the sequence. */
  public A064274() {
    super(0, new A035513(), 1, 1);
  }

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ZERO;
    }
    return super.next();
  }
}
