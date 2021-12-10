package irvine.oeis.a029;

import irvine.oeis.PrependSequence;
import irvine.oeis.a001.A001285;
import irvine.oeis.transform.BoustrophedonTransformSequence;

/**
 * A029885 Boustrophedon transform of 1 followed by Thue-Morse sequence A001285.
 * @author Sean A. Irvine
 */
public class A029885 extends BoustrophedonTransformSequence {

  /** Construct the sequence. */
  public A029885() {
    super(new PrependSequence(new A001285(), 1));
  }
}
