package irvine.oeis.a035;
// Manually, 2020-09-03

import irvine.math.z.Z;
import irvine.oeis.RecordSequence;
import irvine.oeis.a000.A000290;
/**
 * A035383 Automorphic numbers: n ends with square root of n.
 * @author Georg Fischer
 */
public class A035383 extends RecordSequence {

  private long mN = -1;
  
  /** Construct the sequence. */
  public A035383() {
    super(1, new A000290(), false);
  }
  
  @Override
  public boolean isOk(final Z term) {
    return term.toString().endsWith(String.valueOf(++mN));
  }
}
