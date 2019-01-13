package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.a000.A000040;

/**
 * A008578.
 * @author Sean A. Irvine
 */
public class A008578 extends PrependSequence {

  /** Construct the sequence. */
  public A008578() {
    super(new A000040(), Z.ONE);
  }
}

