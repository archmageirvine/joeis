package irvine.oeis.a081;
// Generated by gen_seq4.pl simgcd at 2023-08-12 22:14

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a063.A063011;

/**
 * A081752 Ordered product of the sides of primitive Pythagorean triangles divided by 60.
 * @author Georg Fischer
 */
public class A081752 extends AbstractSequence {

  private final AbstractSequence mSeq = new A063011();

  /** Construct the sequence. */
  public A081752() {
    super(1);
  }

  @Override
  public Z next() {
    return mSeq.next().divide(60);
  }
}
