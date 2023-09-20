package irvine.oeis.a078;

import irvine.math.z.Z;
import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a000.A000142;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A078778 Numbers n such that n!+1 is a semiprime.
 * @author Sean A. Irvine
 */
public class A078778 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A078778() {
    super(1, 0, new SimpleTransformSequence(new A000142(), Z.ONE::add), SEMIPRIME);
  }
}
