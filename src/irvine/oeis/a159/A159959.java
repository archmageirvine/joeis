package irvine.oeis.a159;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.Sequence;
import irvine.oeis.a004.A004601;

/**
 * A159959 Lodumo_2 of A004601 (expansion of Pi in base 2).
 * Deleham's Lodumo_k transform of a sequence L:
 * The list a(n) is returned and defined by the smallest number not yet in
 * the list a(.) satisfying a(n)=L(n) (mod k).
 * @author Georg Fischer
 */
public class A159959 extends AbstractSequence {

  private final Sequence mSeq;
  private final Z mK;
  private final HashSet<Z> mSet;

  /** Construct the sequence. */
  public A159959() {
    this(0, 2, new A004601());
  }

  /**
   * Generic constructor with parameters
   * @param offset first index
   * @param k residue for the mod operation
   * @param seq underlying sequence
   */
  public A159959(final int offset, final int k, final Sequence seq) {
    super(offset);
    mSeq = seq;
    mK = Z.valueOf(k);
    mSet = new HashSet<>(64);
  }

  @Override
  public Z next() {
    Z result = null;
    Z an = mSeq.next().mod(mK);
    boolean busy = true;
    while (busy) {
      if (!mSet.contains(an)) {
        mSet.add(an);
        result = an;
        busy = false;
      }
      an = an.add(mK);
    }
    return result;
  }
}
