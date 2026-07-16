package irvine.oeis.a085;

import irvine.math.z.Z;
import irvine.oeis.a181.A181539;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A085877 Smallest square k^2 == 1 (mod 10^n) where k &gt; 1.
 * @author Sean A. Irvine
 */
public class A085877 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A085877() {
    super(new A181539(), Z::square);
  }
}
