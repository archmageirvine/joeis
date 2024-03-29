package irvine.oeis.a258;
// Generated by gen_seq4.pl simgcd at 2023-08-12 22:14

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a024.A024365;

/**
 * A258151 Areas of primitive Pythagorean triangles divided by 6, in increasing order without multiple entries.
 * @author Georg Fischer
 */
public class A258151 extends AbstractSequence {

  private final AbstractSequence mSeq = new A024365();

  /** Construct the sequence. */
  public A258151() {
    super(1);
  }

  @Override
  public Z next() {
    return mSeq.next().divide(6);
  }
}
