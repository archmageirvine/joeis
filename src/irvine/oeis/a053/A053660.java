package irvine.oeis.a053;

import irvine.math.group.GaloisField;
import irvine.math.z.Z;

/**
 * A053658.
 * @author Sean A. Irvine
 */
public class A053660 extends A053651 {

  /** Construct the sequence. */
  public A053660() {
    super(new GaloisField(Z.TWO, 2));
  }
}
