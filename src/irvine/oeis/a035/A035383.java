package irvine.oeis.a035;
// Manually, 2020-09-03

import irvine.math.z.Z;
import irvine.oeis.Subsequence;
import irvine.oeis.a000.A000290;
/**
 * A035383 Automorphic numbers: n ends with square root of n.
 * @author Georg Fischer
 */
public class A035383 extends Subsequence {

  private int mN; 
  
  /** Construct the sequence. */
  public A035383() {
    super(new A000290());
    mN = -1;
    // next();
  }
  
  @Override
  public boolean isOk(final Z term) {
    ++mN;
    return term.toString().endsWith(String.valueOf(mN));
  }
}
