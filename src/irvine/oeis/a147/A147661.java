package irvine.oeis.a147;
// manually knest at 2023-06-02 20:44

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a000.A000312;

/**
 * A147661 a(n) = squarefree part of n^n.
 * @author Georg Fischer
 */
public class A147661 extends AbstractSequence {

  private final A000312 mSeq1 = new A000312();

  /** Construct the sequence. */
  public A147661() {
    super(1);
  }

  {
    mSeq1.next();
  }

  @Override
  public Z next() {
    return Jaguar.factor(mSeq1.next()).core();
  }
}
