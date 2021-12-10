package irvine.oeis.a058;

import irvine.math.z.Z;
import irvine.oeis.transform.Stirling1TransformSequence;
import irvine.oeis.a006.A006351;

/**
 * A058381 Number of series-parallel networks with n labeled edges, multiple edges not allowed.
 * @author Sean A. Irvine
 */
public class A058381 extends Stirling1TransformSequence {

  private boolean mFirst = true;

  /** Construct the sequence. */
  public A058381() {
    super(new A006351(), -1);
  }

  @Override
  public Z next() {
    if (mFirst) {
      mFirst = false;
      return Z.ZERO;
    }
    return super.next();
  }
}
