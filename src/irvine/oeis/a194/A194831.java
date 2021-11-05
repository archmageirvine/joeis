package irvine.oeis.a194;
// manually deris2/recordval at 2021-11-04

import irvine.oeis.RecordSubsequence;
import irvine.oeis.a046.A046927;
/**
 * A194831 Records in the number of ways to express an odd number as a sum 2*p+q, with p, q primes.
 * Records in A046927. The growth rate of this sequence makes the slow growth of A194829 plausible, i.e. 2*n+1 can be represented by 2*p+q with q&lt;&lt;p.
 * @author Georg Fischer
 */
public class A194831 extends RecordSubsequence {

  /** Construct the sequence. */
  public A194831() {
    super(new A046927());
    next();
  }
}
