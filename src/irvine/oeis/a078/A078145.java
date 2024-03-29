package irvine.oeis.a078;
// Generated by gen_seq4.pl nesta at 2023-10-19 23:23

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a003.A003285;
import irvine.oeis.a038.A038507;

/**
 * A078145 Length of period of continued fraction for square root of 1+n!.
 * Formula: <code>a(n) = A003285(A038507(n)).</code>
 * @author Georg Fischer
 */
public class A078145 extends AbstractSequence {

  private final A003285 mSeq1 = new A003285();
  private final AbstractSequence mSeq2 = new A038507().skip(1);

  /** Construct the sequence. */
  public A078145() {
    super(1);
  }

  @Override
  public Z next() {
    return mSeq1.a(mSeq2.next());
  }
}
