package irvine.oeis.a050;

import irvine.math.z.Z;
import irvine.oeis.a006.A006918;

/**
 * A050189 T(n,4), array T as in A050186; a count of aperiodic binary words.
 * @author Sean A. Irvine
 */
public class A050189 extends A006918 {

  /** Construct the sequence. */
  public A050189() {
    super(4);
  }

  @Override
  public Z next() {
    return super.next().multiply(mN + 4);
  }
}
