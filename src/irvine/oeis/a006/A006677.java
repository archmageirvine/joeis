package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.Stirling2TransformSequence;
import irvine.oeis.a001.A001147;

/**
 * A006677.
 * @author Sean A. Irvine
 */
public class A006677 extends Stirling2TransformSequence {

  /** Construct the sequence. */
  public A006677() {
    super(new PrependSequence(new A001147(), Z.ONE), 0);
    next();
  }
}
