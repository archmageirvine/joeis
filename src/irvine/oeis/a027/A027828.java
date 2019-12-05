package irvine.oeis.a027;

import irvine.oeis.DifferenceSequence;
import irvine.oeis.a010.A010785;

/**
 * A027828 First differences of <code>A010785</code>.
 * @author Sean A. Irvine
 */
public class A027828 extends DifferenceSequence {

  /** Construct the sequence. */
  public A027828() {
    super(new A010785());
  }
}
