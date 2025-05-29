package irvine.oeis.a077;

import java.util.Collections;
import java.util.List;

import irvine.math.z.Z;

/**
 * A077554 Final terms of rows of A077553.
 * @author Sean A. Irvine
 */
public class A077554 extends A077553 {

  private int mN = 0;
  private long mMaxP = 2;
  private List<Long> mRow = Collections.emptyList();

  @Override
  public Z next() {
    ++mN;
    while (mRow.size() < mN) {
      mRow = buildComposites(mMaxP);
      ++mMaxP;
    }
    return Z.valueOf(mRow.get(mN - 1));
  }
}
