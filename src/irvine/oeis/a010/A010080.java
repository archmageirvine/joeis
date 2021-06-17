package irvine.oeis.a010;
// manually 2021-06-17

import irvine.math.z.Z;

/**
 * A010080 Weight distribution of [16,11,4] extended Hamming code of length 16.
 * @author Georg Fischer
 */
public class A010080 extends A010085 {

  private int mN;
  
  /** Construct the sequence. */
  public A010080() {
    this(15);
  } 
  
  /**
   * General constructor with parameter
   * @param m length of the Hamming code (2^k-1).
   */
  public A010080(final int m) {
    super(m);
    mN = -1;
  }

  @Override
  public Z next() {
    Z result = super.next();
    ++mN;
    if (mN > 0) {
      final Z term = super.next();
      if (term != null) {
        result = result.add(term);
      }
    }
    return result;
  }
}
