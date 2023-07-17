package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.a004.A004105;

/**
 * A001375 Relational systems on n nodes.
 * @author Sean A. Irvine
 */
public class A001375 extends A004105 {

  /** Construct the sequence. */
  public A001375() {
    super(1);
  }

  {
    super.next();
  }

  @Override
  protected Z base() {
    return Z.EIGHT;
  }
}

