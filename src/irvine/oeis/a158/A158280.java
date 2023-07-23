package irvine.oeis.a158;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a145.A145511;

/**
 * A158280 Octosection: A145511(8n+4) or A145501(8n+4).
 * @author Georg Fischer
 */
public class A158280 extends AbstractSequence {

  private final A145511 mSeq1 = new A145511();

  /** Construct the sequence. */
  public A158280() {
    super(0);
  }

  @Override
  public Z next() {
    mSeq1.next();
    mSeq1.next();
    mSeq1.next();
    final Z result = mSeq1.next();
    mSeq1.next();
    mSeq1.next();
    mSeq1.next();
    mSeq1.next();
    return result;
  }
}
