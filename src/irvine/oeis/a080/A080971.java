package irvine.oeis.a080;

import irvine.oeis.SetDifferenceSequence;
import irvine.oeis.a014.A014486;

/**
 * A080910.
 * @author Sean A. Irvine
 */
public class A080971 extends SetDifferenceSequence {

  /** Construct the sequence. */
  public A080971() {
    super(0, new A014486(), new A080981());
  }
}

