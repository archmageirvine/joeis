package irvine.oeis.a324;
// Generated by gen_seq4.pl simgcd at 2023-08-14 15:24

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a035.A035009;

/**
 * A324133 Number of permutations of [n] that avoid the shuffle pattern s-k-t, where s = 12 and t = 12.
 * @author Georg Fischer
 */
public class A324133 extends AbstractSequence {

  private final AbstractSequence mSeq = new A035009();

  /** Construct the sequence. */
  public A324133() {
    super(0);
  }

  @Override
  public Z next() {
    return mSeq.next().divide2().add(1);
  }
}
