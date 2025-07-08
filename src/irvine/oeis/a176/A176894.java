package irvine.oeis.a176;
// manually 2025-07-08/sintrif at 2025-07-08 21:29

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a048.A048385;

/**
 * A176894 Increase each digit in the binary representation of n by 2.
 * @author Georg Fischer
 */
public class A176894 extends AbstractSequence {

  private final A048385 mSeq = new A048385(0, new String[] {"2", "3", "32", "33", "322", "323", "332", "333", "3222", "3223", "3232"});
  private int mN;

  /** Construct the sequence. */
  public A176894() {
    super(0);
    mN = -1;
  }

  @Override
  public Z next() {
    return mSeq.a(Integer.parseInt(Integer.toString(++mN, 2)));
  }
}
