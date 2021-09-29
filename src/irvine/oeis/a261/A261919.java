package irvine.oeis.a261;
// manually diffseq at 2021-09-28

import irvine.math.z.Z;
import irvine.oeis.DifferenceSequence;
import irvine.oeis.a004.A004110;

/**
 * A261919 Number of n-node unlabeled graphs without isolated nodes or endpoints (i.e., no nodes of degree 0 or 1).
 * @author Georg Fischer
 */
public class A261919 extends DifferenceSequence {

  protected long mN = -1;

  /** Construct the sequence. */
  public A261919() {
    super(new A004110());
  }

  @Override
  public Z next() {
    ++mN;
    return mN <= 0 ? Z.ONE : super.next();
  }
}

