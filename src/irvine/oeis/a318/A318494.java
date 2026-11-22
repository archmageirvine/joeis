package irvine.oeis.a318;

import java.util.ArrayList;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.transform.EulerTransformUtils;

/**
 * A318494 Number of rooted simple connected graphs on n unlabeled nodes where every block is a complete graph with nonroot nodes of two colors.
 * @author Gregory Morse
 */
public class A318494 extends Sequence1 {
  // After Andrew Howroyd.
  private final ArrayList<Z> mRoots = new ArrayList<>();
  private final ArrayList<Z> mBlocks = new ArrayList<>();

  @Override
  public Z next() {
    final Z count = EulerTransformUtils.eulerTransform(mBlocks, mRoots.size());
    mRoots.add(count.multiply2());
    mBlocks.add(EulerTransformUtils.eulerTransform(mRoots, mRoots.size()));
    return count;
  }
}
