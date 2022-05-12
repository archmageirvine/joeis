package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;

/**
 * A056868 Numbers that are not nilpotent numbers.
 * @author Sean A. Irvine
 */
public class A056868 extends ComplementSequence {

  /** Construct the sequence. */
  public A056868() {
    super(new A056867(), Z.ONE);
  }
}

