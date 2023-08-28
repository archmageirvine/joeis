package irvine.oeis.a259;
// manually simgcd at 2023-08-27 22:03

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a000.A000422;
import irvine.oeis.a007.A007908;

/**
 * A259937 Concatenation of the numbers from 1 to n with numbers from n down to 1.
 * a(n) = A007908(n) concatenated with A000422(n).
 * @author Georg Fischer
 */
public class A259937 extends AbstractSequence {

  private final A007908 mSeq1 = new A007908();
  private final A000422 mSeq2 = new A000422();

  /** Construct the sequence. */
  public A259937() {
    super(1);
  }

  @Override
  public Z next() {
    return new Z(mSeq1.next().toString() + mSeq2.next().toString());
  }
}
