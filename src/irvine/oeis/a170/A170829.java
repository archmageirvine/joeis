package irvine.oeis.a170;
// Generated by gen_seq4.pl simple/simbinom at 2023-03-20 18:29

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A170829 a(n) = gcd(Catalan(n), n!).
 * @author Georg Fischer
 */
public class A170829 extends AbstractSequence {

  private int mN = -1;

  /** Construct the sequence. */
  public A170829() {
    super(0);
  }

  @Override
  public Z next() {
    ++mN;
    return Binomial.catalan(mN).gcd(MemoryFactorial.SINGLETON.factorial(mN));
  }
}
