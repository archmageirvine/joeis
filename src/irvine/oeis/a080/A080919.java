package irvine.oeis.a080;

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;

/**
 * A080919 Numbers that do not appear in A080900.
 * @author Sean A. Irvine
 */
public class A080919 extends ComplementSequence {

  /** Construct the sequence. */
  public A080919() {
    super(1, Z.ONE, new A080914());
  }
}

