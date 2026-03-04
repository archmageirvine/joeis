package irvine.oeis.a083;

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A083112 Product of terms in row n of A083110.
 * @author Sean A. Irvine
 */
public class A083112 extends AbstractSequence {

  private int mN = -1;

  private final A083110 mSeq = new A083110();

  /** Construct the sequence. */
  public A083112() {
    super(1);
  }

  @Override
  public Z next() {
    return Integers.SINGLETON.product(0, ++mN, k -> mSeq.next());
  }
}

