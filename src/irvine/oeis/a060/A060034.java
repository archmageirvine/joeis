package irvine.oeis.a060;

import irvine.oeis.Combiner;
import irvine.oeis.a000.A000041;
import irvine.oeis.a000.A000837;
import irvine.oeis.a024.A024994;

/**
 * A060034 Number of partitions of n such that all parts are neither relatively prime (cf. A000837) nor are they periodic with each part occurring the same number of times (cf. A024994).
 * @author Sean A. Irvine
 */
public class A060034 extends Combiner {

  /** Construct the sequence. */
  public A060034() {
    super(1, new A000041().skip(1), new Combiner(new A000837().skip(1), new A024994(), ADD), SUBTRACT);
  }
}
