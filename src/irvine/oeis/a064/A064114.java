package irvine.oeis.a064;

import irvine.oeis.SetDifferenceSequence;
import irvine.oeis.a034.A034683;
import irvine.oeis.a293.A293188;

/**
 * A064114 Unitary weird numbers: unitary abundant (A034683) but not unitary pseudoperfect (A293188).
 * @author Sean A. Irvine
 */
public class A064114 extends SetDifferenceSequence {

  /** Construct the sequence. */
  public A064114() {
    super(new A034683(), new A293188());
  }
}
