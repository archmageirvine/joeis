package irvine.oeis.a078;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a006.A006577;

/**
 * A078441 a(n) begins the first chain of n consecutive positive integers that have equal h-values, where h(k) is the length of the finite sequence k, f(k), f(f(k)), ...., 1 in the Collatz (or 3x + 1) problem. (The earliest "1" is meant.).
 * @author Sean A. Irvine
 */
public class A078441 extends Sequence1 {

  private final Sequence mSeq = new A006577();
  private Z mA = mSeq.next();
  private long mN = 0;
  private long mM = 1;
  private long mFirst = 0;
  private long mChain = 0;

  @Override
  public Z next() {
    ++mN;
    while (mChain < mN) {
      long len = 1;
      mFirst = mM;
      while (true) {
        ++mM;
        Z t = mSeq.next();
        if (!t.equals(mA)) {
          mA = t;
          mChain = len;
          break;
        }
        ++len;
      }
    }
    return Z.valueOf(mFirst);
  }
}

