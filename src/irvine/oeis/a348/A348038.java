package irvine.oeis.a348;
// Generated by gen_seq4.pl anopan 1,1

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a003.A003968;

/**
 * A348038 a(n) = A003968(n) / gcd(n, A003968(n)), where A003968 is multiplicative with a(p^e) = p*(p+1)^(e-1).
 * @author Georg Fischer
 */
public class A348038 extends AbstractSequence {

  private final A003968 mSeq1 = new A003968();
  private final A348036 mSeq2 = new A348036();

  /** Construct the sequence. */
  public A348038() {
    super(1);
  }

  @Override
  public Z next() {
    return mSeq1.next().divide(mSeq2.next());
  }
}
