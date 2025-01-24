package irvine.oeis.a074;

import irvine.math.q.Q;
import irvine.oeis.Combiner;
import irvine.oeis.a000.A000010;

/**
 * A074642 Numerator of A074639(n)/A000010(n).
 * @author Sean A. Irvine
 */
public class A074642 extends Combiner {

  /** Construct the sequence. */
  public A074642() {
    super(1, new A074639().skip(), new A000010(), (a, b) -> new Q(a, b).num());
  }
}
