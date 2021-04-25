package irvine.oeis.a336;
// manually 

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000265;
import irvine.oeis.a001.A001227;

/**
 * A336475 Multiplicative with a(2^e) = 1, and for odd primes p, a(p^e) = (e+1)*p^e.
 * a(n) = A000265(n) * A001227(n).
 * @author Georg Fischer
 */
public class A336475 extends A000265 {

  protected Sequence mSeq;
  
  /** Construct the sequence. */
  public A336475() {
    mSeq = new A001227();
  }

  @Override
  public Z next() {
    return super.next().multiply(mSeq.next());
  }

}
