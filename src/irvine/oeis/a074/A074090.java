package irvine.oeis.a074;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A074090 Number of steps to reach an integer starting with s = n/4 and iterating the map x -&gt; s*ceiling(x).
 * @author Sean A. Irvine
 */
public class A074090 extends AbstractSequence {

  private final long mDen;
  private long mN;

  protected A074090(final int den) {
    super(den + 1);
    mDen = den;
    mN = den;
  }

  /** Construct the sequence. */
  public A074090() {
    this(4);
  }


  @Override
  public Z next() {
    final Q s = new Q(++mN, mDen);
    long cnt = 0;
    Q x = s;
    while (!x.isInteger()) {
      ++cnt;
      x = s.multiply(x.ceiling());
    }
    return Z.valueOf(cnt);
  }
}
