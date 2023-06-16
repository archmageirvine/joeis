package irvine.oeis.a362;
// manually amoda

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a067.A067055;
import irvine.oeis.a255.A255268;

/**
 * A362288 a(n) = Product_{k=0..n} binomial(n,k)^k.
 * @author Georg Fischer
 */
public class A362288 extends AbstractSequence {

  private int mN = -1;
  private A067055 mSeq1 = new A067055();
  private A255268 mSeq2 = new A255268();

  /** Construct the sequence. */
  public A362288() {
    super(0);
  }

  @Override
  public Z next() {
    ++mN;
    return mSeq1.next().divide((mN == 0) ? Z.ONE : mSeq2.next());
  }
}
