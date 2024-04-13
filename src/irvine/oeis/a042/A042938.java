package irvine.oeis.a042;
// manually 2021-03-04

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A042938 Reverse or triple: if reverse(a(n)) &gt; a(n), a(n+1) = reverse(a(n)), else a(n+1) = 3*a(n).
 * @author Georg Fischer
 */
public class A042938 extends Sequence1 {

  protected Z mTerm; // a(n)
  
  /** Construct the sequence. */
  public A042938() {
    mTerm = Z.ONE;
  }

  @Override
  public Z next() {
    final Z result = mTerm;
    final Z rev = Functions.REVERSE.z(10, mTerm);
    mTerm = rev.compareTo(mTerm) > 0 ? rev : mTerm.multiply(3);
    return result;
  }
}
