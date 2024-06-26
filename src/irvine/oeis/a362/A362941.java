package irvine.oeis.a362;
// Generated by gen_seq4.pl 2024-05-09/multraf at 2024-05-09 22:36

import irvine.oeis.a108.A108604;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A362941 Numbers of the form (p+1)*(p+3) where (p,p+2) is a twin prime pair (cf. A001359).
 * @author Georg Fischer
 */
public class A362941 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A362941() {
    super(1, (self, n) -> self.s(0).subtract(1), "", new A108604());
  }
}
