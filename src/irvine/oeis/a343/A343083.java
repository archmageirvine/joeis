package irvine.oeis.a343;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A343083 a(n) is the smallest number that is the sum of n positive 5th powers in three ways.
 * @author Sean A. Irvine
 */
public class A343083 extends AbstractSequence {

  /** Construct the sequence. */
  public A343083() {
    super(5);
  }

  private long mN = 4;

  @Override
  public Z next() {
    if (++mN == 5) {
      return Z.valueOf(13124675);
    } else if (mN == 6) {
      return Z.valueOf(696467);
    } else if (mN == 7) {
      return Z.valueOf(84457);
    } else if (mN <= 9) {
      return Z.valueOf(mN + 52409);
    } else if (mN <= 20) {
      return Z.valueOf(mN + 8184);
    } else if (mN <= 27) {
      return Z.valueOf(mN + 7775);
    } else if (mN <= 30) {
      return Z.valueOf(mN + 7557);
    } else if (mN <= 35) {
      return Z.valueOf(mN + 7502);
    } else if (mN <= 65) {
      return Z.valueOf(mN + 4092);
    } else {
      return Z.valueOf(mN + 2046);
    }
  }
}
