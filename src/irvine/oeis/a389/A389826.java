package irvine.oeis.a389;

import irvine.oeis.a030.A030101;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A389826 a(n) = floor(n*A030101(n)/(n + A030101(n))).
 * @author Sean A. Irvine
 */
public class A389826 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A389826() {
    super(1, new A030101().skip(), (n, k) -> k.multiply(n).divide(k.add(n)));
  }
}

