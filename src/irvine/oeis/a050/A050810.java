package irvine.oeis.a050;

import irvine.math.z.Z;
import irvine.oeis.InverseSequence;

/**
 * A050810 From sequence A050782, the n's corresponding to the first occurrence of m (or 0 if not defined).
 * @author Sean A. Irvine
 */
public class A050810 extends InverseSequence {

  /** Construct the sequence. */
  public A050810() {
    super(new A050782(), 0, 0);
  }

  @Override
  public Z next() {
    if ((mN + 1) % 10 == 0) {
      ++mN;
      return Z.ZERO;
    }
    return super.next();
  }
}
