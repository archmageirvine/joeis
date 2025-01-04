package irvine.oeis.a111;

import java.util.ArrayList;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a005.A005359;
import irvine.oeis.transform.BellMatrixTransformSequence;
import irvine.oeis.triangle.BaseTriangle;

/**
 * A111594 Triangle of arctanh numbers.
 * Also the Bell transform of A005359.
 * @author Sean A. Irvine
 */
public class A111594 extends BaseTriangle {

  private final ArrayList<Z> mA = new ArrayList<>();
  private final BellMatrixTransformSequence mB = new BellMatrixTransformSequence(mA);
  private final Sequence mSeq;

  /** Construct the sequence. */
  public A111594() {
    this(0, new A005359());
  }

  public A111594(final int offset, final Sequence seq) {
    super(offset, offset, offset);
    mSeq = seq;
  }

  @Override
  public void addRow() {
    mA.add(mSeq.next());
    super.addRow();
  }

  @Override
  public Z triangleElement(final int n, final int k) {
    return mB.get(n, k);
  }
}
