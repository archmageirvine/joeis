package irvine.oeis.a361;
// manually roban1/adjext at 2026-10-06 

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.Sequence;
import irvine.oeis.a164.A164896;

/**
 * A361659 Number of strictly convex unit-sided polygons with all internal angles equal to a multiple of Pi/n, treating polygons that have a unique mirror image as distinct but ignoring rotational copies.
 * @author Georg Fischer
 */
public class A361659 extends AbstractSequence {

  private final Sequence mSeq = new A164896();

  /** Construct the sequence */
  public A361659() {
    super(1);
  }

  @Override
  public Z next() {
    mSeq.next();
    return mSeq.next().subtract(2);
  }
}
