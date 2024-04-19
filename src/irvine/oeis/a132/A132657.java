package irvine.oeis.a132;
// manually anopan 1,2

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a007.A007491;
import irvine.oeis.a053.A053001;

/**
 * A132657 a(n) is the product of the least prime &gt; n^2 and the greatest prime &lt; (n+1)^2.
 * @author Georg Fischer
 */
public class A132657 extends AbstractSequence {

  private final A007491 mSeq1 = new A007491();
  private final A053001 mSeq2 = new A053001();

  /** Construct the sequence. */
  public A132657() {
    super(1);
  }

  @Override
  public Z next() {
    return mSeq1.next().multiply(mSeq2.next());
  }
}
