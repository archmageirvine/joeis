package irvine.oeis.a354;
// manually anopan 1,0

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a069.A069513;
import irvine.oeis.a079.A079978;

/**
 * A354982 a(n) = 1 if n is a prime power congruent to 1 (mod 3), otherwise 0.
 * @author Georg Fischer
 */
public class A354982 extends AbstractSequence {

  private A069513 mSeq1 = new A069513();
  private A079978 mSeq2 = new A079978();

  /** Construct the sequence. */
  public A354982() {
    super(1);
  }

  @Override
  public Z next() {
    return mSeq1.next().multiply(mSeq2.next());
  }
}
