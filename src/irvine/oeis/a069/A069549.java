package irvine.oeis.a069;

import irvine.math.z.Z;
import irvine.oeis.a007.A007918;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A069549 Smallest composite k such that phi(k) &gt; k*(1-1/n).
 * @author Sean A. Irvine
 */
public class A069549 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A069549() {
    super(1, new A007918().skip(), Z::square);
  }
}
