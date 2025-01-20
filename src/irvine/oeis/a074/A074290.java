package irvine.oeis.a074;

import irvine.oeis.a000.A000002;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A074290 Difference between Kolakoski(n)=A000002(n) and 1 (n odd) or 2 (n even).
 * @author Sean A. Irvine
 */
public class A074290 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A074290() {
    super(new A000002(), (n, k) -> k.subtract((n & 1) == 1 ? 1 : 2));
  }
}
