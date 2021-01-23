package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.oeis.GeneratingFunctionSequence;

/**
 * A038578 Number of self-avoiding closed walks from 0 of area n in strip Z X {-1,0,1}.
 * @author Sean A. Irvine
 */
public class A038578 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A038578() {
    super(0, new long[] {4, 0, -4, 0, 4},
      new long[] {1, -2, -1, 0, 3, 2, 1});
  }

  @Override
  public Z next() {
    return super.next().subtract(mIndex == 1 ? 3 : 0);
  }
}
