package irvine.oeis.a145;
// Generated by gen_seq4.pl anopan 

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a053.A053811;
import irvine.oeis.a053.A053812;

/**
 * A145521 Take the primes raised to prime exponents, arranged in numerical order (A053810). If A053810(n) = r(n)^q(n), where r(n) and q(n) are primes, then a(n) = q(n)^r(n).
 * @author Georg Fischer
 */
public class A145521 extends AbstractSequence {

  private final A053812 mSeq1 = new A053812();
  private final A053811 mSeq2 = new A053811();

  /** Construct the sequence. */
  public A145521() {
    super(1);
  }

  @Override
  public Z next() {
    return mSeq1.next().pow(mSeq2.next());
  }
}
