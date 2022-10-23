package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A054794 Numbers of form 5+n^2+n or 5+2*n^2.
 * @author Sean A. Irvine
 */
public class A054794 extends Sequence1 {

  private long mN = 0;
  private long mM = 0;
  private final long mAdd;

  protected A054794(final long add) {
    mAdd = add;
  }

  /** Construct the sequence. */
  public A054794() {
    this(5);
  }

  @Override
  public Z next() {
    final Z a = Z.valueOf(mN).square().add(mN).add(mAdd);
    final Z b = Z.valueOf(mM).square().multiply2().add(mAdd);
    final int c = b.compareTo(a);
    if (c >= 0) {
      ++mN;
      if (c == 0) {
        ++mM;
      }
      return a;
    } else {
      ++mM;
      return b;
    }
  }
}
