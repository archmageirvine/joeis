package irvine.oeis.a039;

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;
import irvine.oeis.a037.A037084;

/**
 * A039500 Iterations of "k-&gt;k/2 if k is even, k-&gt;3k-1 if k is odd" (A001281) starting at these numbers reach 1.
 * @author Sean A. Irvine
 */
public class A039500 extends ComplementSequence {

  /** Construct the sequence. */
  public A039500() {
    super(new A037084(), Z.ONE);
  }
}
