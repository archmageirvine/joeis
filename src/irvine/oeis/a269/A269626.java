package irvine.oeis.a269;
// manually amoda

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a003.A003418;
import irvine.oeis.a058.A058312;

/**
 * A269626 a(n) = A003418(n) / A058312(n) with a(0) = 1.
 * @author Georg Fischer
 */
public class A269626 extends AbstractSequence {

  private A003418 mSeq1 = new A003418();
  private PrependSequence mSeq2 = new PrependSequence(new A058312(), 1);

  /** Construct the sequence. */
  public A269626() {
    super(0);
  }

  @Override
  public Z next() {
    return mSeq1.next().divide(mSeq2.next());
  }
}
