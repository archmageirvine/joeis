package irvine.oeis.a112;

import irvine.oeis.PrependSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a210.A210459;

/**
 * A112158 McKay-Thompson series of class 20A for the Monster group.
 * @author Sean A. Irvine
 */
public class A112158 extends PrependSequence {

  /** Construct the sequence. */
  public A112158() {
    super(new SkipSequence(new A210459(), 2), 1, 0);
  }
}
