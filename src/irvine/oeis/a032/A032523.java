package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a001.A001203;

/**
 * A032523 Index of first occurrence of n as a term in A001203, the continued fraction for Pi.
 * @author Sean A. Irvine
 */
public class A032523 extends Sequence1 {

  private final DirectSequence mA;
  private Z mN = Z.ZERO;

  protected A032523(final Sequence seq) {
    mA = DirectSequence.create(seq);
  }

  /** Construct the sequence. */
  public A032523() {
    this(new A001203());
  }

  @Override
  public Z next() {
    mN = mN.add(1);
    int k = 0;
    while (!mN.equals(mA.a(k))) {
      ++k;
    }
    return Z.valueOf(k + 1);
  }
}
