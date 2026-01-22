package irvine.oeis.a391;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a039.A039701;

/**
 * A391807 a(n) is the least k such that the residues mod 3 of the primes prime(k), prime(k+1),... include a string of n 1's followed by 2.
 * @author Sean A. Irvine
 */
public class A391807 extends Sequence1 {

  private final Sequence mA = new A039701();
  private long mRunLength = 0;
  private long mRunPos = 0;
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    while (mN > mRunLength) {
      mRunLength = 0;
      while (true) {
        final Z t = mA.next();
        ++mRunPos;
        if (!t.isOne()) {
          break;
        }
        ++mRunLength;
      }
    }
    return Z.valueOf(mRunPos - mN);
  }
}

