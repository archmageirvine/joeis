package irvine.oeis.a165;
// manually 

import irvine.math.z.Z;
import irvine.oeis.a001.A001222;

/**
 * A165824 Totally multiplicative sequence with a(p) = 3.
 * @author Georg Fischer
 */
public class A165824 extends A001222 {

  protected Z mBase;
  
  /** Construct the sequence. */
  public A165824() {
    this(3);
  }
  
  /**
   * Generic constructor with parameter
   * @param base for bigomega(n)
   */
  public A165824(final long base) {
    mBase = Z.valueOf(base);
  }
  
  @Override
  public Z next() {
    return mBase.pow(super.next());
  }
}
