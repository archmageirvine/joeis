package irvine.oeis.a383;

import irvine.oeis.Combiner;
import irvine.oeis.a000.A000170;
import irvine.oeis.a033.A033148;

/**
 * A383489.
 * @author Sean A. Irvine
 */
public class A383738 extends Combiner {

  /** Construct the sequence. */
  public A383738() {
    super(1, new A000170().skip(), new A033148(), SUBTRACT);
  }
}

