package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A056483 Number of primitive (aperiodic) palindromic structures using exactly four different symbols.
 * @author Georg Fischer
 */
public class A056483 extends A056477 {

  private final Sequence mSeq = new A056478();

  /** Construct the sequence. */
  protected A056483() {
    super(1);
    next();
  }

  @Override
  public Z next() {
    return mSeq.next().subtract(super.next());
  }
}
