package irvine.oeis.a078;

import irvine.oeis.a000.A000040;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A078171 a(n) = A055086(A000040(n)).
 * @author Sean A. Irvine
 */
public class A078171 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A078171() {
    super(1, new A000040(), p -> p.multiply(4).add(1).sqrt().subtract(1));
  }
}
