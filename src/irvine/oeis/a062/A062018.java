package irvine.oeis.a062;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a000.A000312;

/**
 * A062018 a(n) = n^n written backwards.
 * @author Sean A. Irvine
 */
public class A062018 extends AbstractSequence {

  private final A000312 mSeq1 = new A000312();

  /** Construct the sequence. */
  public A062018() {
    super(1);
  }

  {
    mSeq1.next();
  }

  @Override
  public Z next() {
    return Functions.REVERSE.z(mSeq1.next());
  }
}
