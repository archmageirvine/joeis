package irvine.oeis.a071;

import irvine.math.z.Z;
import irvine.oeis.FilterSequence;
import irvine.oeis.a001.A001359;

/**
 * A071698 Lesser members of twin prime pairs of form (4*k+3, 4*k+5), k &gt;= 0.
 * @author Sean A. Irvine
 */
public class A071698 extends FilterSequence {

  /** Construct the sequence. */
  public A071698() {
    super(new A001359(), p -> p.and(Z.THREE).equals(Z.THREE));
  }
}
