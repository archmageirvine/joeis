package irvine.oeis.a112;

import irvine.oeis.PrependSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a223.A223903;

/**
 * A112159 McKay-Thompson series of class 20C for the Monster group.
 * @author Sean A. Irvine
 */
public class A112159 extends PrependSequence {

  /** Construct the sequence. */
  public A112159() {
    super(new SkipSequence(new A223903(), 2), 1, 0);
  }
}
