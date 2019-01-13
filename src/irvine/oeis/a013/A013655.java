package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.a001.A001060;

/**
 * A013655.
 * @author Sean A. Irvine
 */
public class A013655 extends PrependSequence {

  /** Construct the sequence. */
  public A013655() {
    super(new A001060(), Z.THREE);
  }
}
