package irvine.oeis.a056;

import irvine.oeis.DifferenceSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a025.A025488;

/**
 * A056099 First differences of A025488 (binary order for least prime signatures).
 * @author Sean A. Irvine
 */
public class A056099 extends DifferenceSequence {

  /** Construct the sequence. */
  public A056099() {
    super(new PrependSequence(new A025488(), 0));
  }
}
