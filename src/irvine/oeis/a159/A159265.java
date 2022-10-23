package irvine.oeis.a159;
// manually 2021-08-08

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A159265 Google primes: primes of the form 379*10^n+9 = 3790...09. 
 * @author Georg Fischer
 */
public class A159265 extends Sequence1 {

  protected Z mG; // the GOOGLE word when rotated by 180 degrees

  /** Construct the sequence. */
  public A159265() {
    mG = Z.valueOf(37909);
  }

  @Override
  public Z next() {
    while (true) {
      mG = mG.multiply(10).subtract(81);
      if (mG.isProbablePrime()) {
        return mG;
      }
    }
  }
}
