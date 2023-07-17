package irvine.oeis.a050;

import irvine.math.z.Z;
import irvine.oeis.a001.A001840;

/**
 * A050188 T(n,3), array T as in A050186; a count of aperiodic binary words.
 * @author Sean A. Irvine
 */
public class A050188 extends A001840 {

  /** Construct the sequence. */
  public A050188() {
    super(3);
  }

  @Override
  public Z next() {
    return super.next().multiply(mN + 3);
  }
}
