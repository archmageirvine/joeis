package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.a063.A063841;

/**
 * A004102 Number of signed graphs with n nodes. Also number of 2-multigraphs on n nodes.
 * @author Sean A. Irvine
 */
public class A004102 extends A063841 {

  /** Construct the sequence. */
  public A004102() {
    super(0);
  }

  private int mN = -1;

  @Override
  public Z next() {
    return t(++mN, 2);
  }
}

