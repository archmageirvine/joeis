package irvine.oeis;

import irvine.math.z.Z;

/**
 * Place holder for a dead sequence.
 * @author Sean A. Irvine
 */
public class DeadSequence extends AbstractSequence {

  protected DeadSequence() {
    this(0);
  }

  protected DeadSequence(final int offset) {
    super(offset);
  }

  @Override
  public Z next() {
    throw new UnsupportedOperationException("Sequence is dead");
  }
}
