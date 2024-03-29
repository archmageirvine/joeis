package irvine.oeis.a329;
// Generated by gen_seq4.pl nesta at 2023-10-19 23:23

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a005.A005361;
import irvine.oeis.a108.A108951;

/**
 * A329382 Product of exponents of prime factors of A108951(n), where A108951 is fully multiplicative with a(prime(i)) = prime(i)# = Product_{i=1..i} A000040(i).
 * Formula: <code>a(n) = A005361(A108951(n)).</code>
 * @author Georg Fischer
 */
public class A329382 extends AbstractSequence {

  private final A005361 mSeq1 = new A005361();
  private final AbstractSequence mSeq2 = new A108951();

  /** Construct the sequence. */
  public A329382() {
    super(1);
  }

  @Override
  public Z next() {
    return mSeq1.a(mSeq2.next());
  }
}
