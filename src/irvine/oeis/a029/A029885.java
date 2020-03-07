package irvine.oeis.a029;

import irvine.oeis.BoustrophedonTransformSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a001.A001285;

/**
 * A029885 Boustrophedon transform of 1 followed by Thue-Morse sequence <code>A001285</code>.
 * @author Sean A. Irvine
 */
public class A029885 extends BoustrophedonTransformSequence {

  /** Construct the sequence. */
  public A029885() {
    super(new PrependSequence(new A001285(), 1));
  }
}
