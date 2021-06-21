package irvine.oeis.a010;
// manually 2021-06-17

import irvine.math.z.Z;

/**
 * A010090 Weight distribution of d=4 Hamming code of length 15.
 * @author Georg Fischer
 */
public class A010090 extends A010085 {

  /** Construct the sequence. */
  public A010090() {
    this(15);
  } 
  
  /**
   * General constructor with parameter
   * @param m length of the Hamming code (2^k-1).
   */
  public A010090(final int m) {
    super(m);
    mLen -= 2;
  }

  @Override
  public Z next() {
    final Z result = super.next();
    super.next(); // OEIS skips every other term
    return result;
  }
}
