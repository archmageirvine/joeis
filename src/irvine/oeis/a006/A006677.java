package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.a001.A001147;
import irvine.oeis.transform.Stirling2TransformSequence;

/**
 * A006677 Number of planted binary phylogenetic trees with n labels.
 * @author Sean A. Irvine
 */
public class A006677 extends Stirling2TransformSequence {

  /** Construct the sequence. */
  public A006677() {
    super(1, new PrependSequence(new A001147(), Z.ONE), 0);
    next();
  }
}
