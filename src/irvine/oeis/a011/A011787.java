package irvine.oeis.a011;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a065.A065128;

/**
 * A011787 Number of n X n matrices over Z_4 whose determinant is 1.
 * @author Sean A. Irvine
 */
public class A011787 extends AbstractSequence {

  private final A065128 mSeq1 = new A065128();

  /** Construct the sequence. */
  public A011787() {
    super(1);
  }

  {
    mSeq1.next();
  }

  @Override
  public Z next() {
    return mSeq1.next().divide2();
  }
}
