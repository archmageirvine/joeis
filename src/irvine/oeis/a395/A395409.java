package irvine.oeis.a395;

import irvine.oeis.Combiner;
import irvine.oeis.a033.A033677;
import irvine.oeis.a135.A135034;

/**
 * A395409 allocated for Fr\u00e9d\u00e9ric D. W. Heidenthal-K\u00f6nig.
 * @author Sean A. Irvine
 */
public class A395409 extends Combiner {

  /** Construct the sequence. */
  public A395409() {
    super(1, new A033677(), new A135034().skip(), SUBTRACT);
  }
}
