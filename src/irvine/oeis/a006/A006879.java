package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.DifferenceSequence;
import irvine.oeis.PrependSequence;

/**
 * A006879.
 * @author Sean A. Irvine
 */
public class A006879 extends DifferenceSequence {

  /** Construct the sequence. */
  public A006879() {
    super(new PrependSequence(new A006880(), Z.ZERO));
  }
}
