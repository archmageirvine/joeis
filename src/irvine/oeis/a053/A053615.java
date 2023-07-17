package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.a004.A004738;

/**
 * A053615 Pyramidal sequence: distance to nearest product of two consecutive integers (promic or heteromecic numbers).
 * @author Sean A. Irvine
 */
public class A053615 extends A004738 {

  /** Construct the sequence. */
  public A053615() {
    super(0);
  }

  @Override
  public Z next() {
    return super.next().subtract(1);
  }
}
