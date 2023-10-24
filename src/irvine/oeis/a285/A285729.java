package irvine.oeis.a285;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a032.A032742;
import irvine.oeis.a046.A046523;

/**
 * A285729 Compound filter: a(n) = T(A032742(n), A046523(n)), where T(n,k) is sequence A000027 used as a pairing function.
 * @author Georg Fischer
 */
public class A285729 extends AbstractSequence {

  private AbstractSequence mSeq1;
  private int mStart1;
  private AbstractSequence mSeq2;
  private int mStart2;

  /** Construct the sequence. */
  public A285729() {
    this(1, new A032742(), 1, new A046523(), 1);
  }

  protected A285729(final int offset, final AbstractSequence seq1, final int start1, final AbstractSequence seq2, final int start2) {
    super(offset);
    mSeq1 = seq1;
    mStart1 = start1;
    mSeq2 = seq2;
    mStart2 = start2;
  }

  @Override
  public Z next() {
    final Z t1 = mSeq1.next();
    final Z t2 = mSeq2.next();
    // a(n) = (1/2)*(2 + ((A032742(n)+A046523(n))^2) - A032742(n) - 3*A046523(n)).
    return t1.add(t2).square().add(2).subtract(t1).subtract(t2.multiply(3)).divide2();
  }
}
