package irvine.oeis.a080;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A080276 Variation on Connell sequence (A001614). In this one, a(1)=1, terms a(n) onwards are generated in "blocks" as the next a(n-1) odd numbers &gt; a(n-1) if the previous block ends with a(n-1) even and the next a(n-1) even numbers &gt; a(n-1) if the previous block ends with a(n-1) odd.
 * @author Sean A. Irvine
 */
public class A080276 extends Sequence1 {

  private long mBlockRemaining = 1;
  private long mAdd = 1;
  private long mN = -2;

  @Override
  public Z next() {
    if (mBlockRemaining == 0) {
      mBlockRemaining = mN + mAdd;
      mAdd = 1 - mAdd;
      if (mAdd == 1) {
        mN -= 2;
      }
    }
    --mBlockRemaining;
    mN += 2;
    return Z.valueOf(mN + mAdd);
  }
}
