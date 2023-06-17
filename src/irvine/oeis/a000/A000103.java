package irvine.oeis.a000;

import irvine.math.plantri.Plantri;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A000103 Number of n-node triangulations of sphere in which every node has degree &gt;= 4.
 * @author Sean A. Irvine
 */
public class A000103 extends AbstractSequence {

  /* Construct the sequence. */
  public A000103() {
    super(4);
  }

  private int mN = 3;

  @Override
  public Z next() {
    if (++mN < 6) {
      return Z.ZERO;
    }
    return Z.valueOf(new Plantri().count(mN, 4, -1, -1, false, false, false, false));
  }

}

