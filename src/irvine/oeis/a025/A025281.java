package irvine.oeis.a025;

import irvine.math.z.Z;
import irvine.oeis.PartialSumSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a001.A001414;

/**
 * A025281 <code>a(n) = sopfr(n!)</code>, where <code>sopfr = A001414</code> is the integer log.
 * @author Sean A. Irvine
 */
public class A025281 extends PartialSumSequence {

  /** Construct the sequence. */
  public A025281() {
    super(new PrependSequence(new A001414(), Z.ZERO));
  }
}
