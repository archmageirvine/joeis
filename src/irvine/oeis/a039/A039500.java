package irvine.oeis.a039;

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;
import irvine.oeis.a037.A037084;

/**
 * A039500 Iterations of "n-&gt;n/2 if n even, n-&gt;3n-1 if n odd" (A001281) starting at these numbers reach 1.
 * @author Sean A. Irvine
 */
public class A039500 extends ComplementSequence {

  /** Construct the sequence. */
  public A039500() {
    super(new A037084(), Z.ONE);
  }
}
