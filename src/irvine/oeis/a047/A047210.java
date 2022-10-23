package irvine.oeis.a047;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A047210 Largest square modulo n.
 * @author Georg Fischer
 */
public class A047210 extends Sequence1 {

  protected int mExpon; // exponent
  protected int mN;

  /** Construct the sequence. */
  public A047210() {
    this(2);
  } 
  
  /**
   * Generic constructor with parameter
   * @param expon exponent
   */
  public A047210(final int expon) {
    mExpon = expon;
    mN = 0;
  }

  @Override
  public Z next() {
    ++mN;
    long max = 0;
    int i = mN - 1;
    boolean busy = true;
    while (busy && i >= 1) {
      final long residue = Z.valueOf(i).pow(mExpon).mod(mN);
      if (residue > max) {
        max = residue;
        busy = max < mN - 1;
      }
      --i;
    }
    return Z.valueOf(max);
  }
}
